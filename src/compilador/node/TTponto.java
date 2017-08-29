/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TTponto extends Token
{
    public TTponto()
    {
        super.setText(".");
    }

    public TTponto(int line, int pos)
    {
        super.setText(".");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTponto(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTponto(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTponto text.");
    }
}