/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TInt32 extends Token
{
    public TInt32()
    {
        super.setText("int32");
    }

    public TInt32(int line, int pos)
    {
        super.setText("int32");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInt32(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInt32(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInt32 text.");
    }
}
