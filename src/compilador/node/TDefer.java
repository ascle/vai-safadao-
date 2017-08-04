/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TDefer extends Token
{
    public TDefer()
    {
        super.setText("defer");
    }

    public TDefer(int line, int pos)
    {
        super.setText("defer");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDefer(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDefer(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDefer text.");
    }
}
