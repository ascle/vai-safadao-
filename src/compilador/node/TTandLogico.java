/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TTandLogico extends Token
{
    public TTandLogico()
    {
        super.setText("&&");
    }

    public TTandLogico(int line, int pos)
    {
        super.setText("&&");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTandLogico(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTandLogico(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTandLogico text.");
    }
}
