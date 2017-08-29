/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TTbarra extends Token
{
    public TTbarra()
    {
        super.setText("/");
    }

    public TTbarra(int line, int pos)
    {
        super.setText("/");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTbarra(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTbarra(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTbarra text.");
    }
}