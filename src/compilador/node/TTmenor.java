/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TTmenor extends Token
{
    public TTmenor()
    {
        super.setText("<");
    }

    public TTmenor(int line, int pos)
    {
        super.setText("<");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTmenor(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTmenor(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTmenor text.");
    }
}