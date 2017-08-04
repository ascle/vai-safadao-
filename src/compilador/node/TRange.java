/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TRange extends Token
{
    public TRange()
    {
        super.setText("range");
    }

    public TRange(int line, int pos)
    {
        super.setText("range");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRange(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRange(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRange text.");
    }
}
