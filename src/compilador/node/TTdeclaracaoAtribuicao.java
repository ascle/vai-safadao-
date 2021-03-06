/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TTdeclaracaoAtribuicao extends Token
{
    public TTdeclaracaoAtribuicao()
    {
        super.setText(":=");
    }

    public TTdeclaracaoAtribuicao(int line, int pos)
    {
        super.setText(":=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTdeclaracaoAtribuicao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTdeclaracaoAtribuicao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTdeclaracaoAtribuicao text.");
    }
}
