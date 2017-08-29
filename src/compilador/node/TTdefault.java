/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TTdefault extends Token
{
    public TTdefault()
    {
        super.setText("default");
    }

    public TTdefault(int line, int pos)
    {
        super.setText("default");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTdefault(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTdefault(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTdefault text.");
    }
}