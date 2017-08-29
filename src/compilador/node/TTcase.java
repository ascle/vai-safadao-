/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TTcase extends Token
{
    public TTcase()
    {
        super.setText("case");
    }

    public TTcase(int line, int pos)
    {
        super.setText("case");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTcase(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTcase(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTcase text.");
    }
}