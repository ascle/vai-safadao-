/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoPsimpleStmt extends PPsimpleStmt
{
    private PPexpressionStmt _pexpressionStmt_;

    public AExpressaoPsimpleStmt()
    {
        // Constructor
    }

    public AExpressaoPsimpleStmt(
        @SuppressWarnings("hiding") PPexpressionStmt _pexpressionStmt_)
    {
        // Constructor
        setPexpressionStmt(_pexpressionStmt_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoPsimpleStmt(
            cloneNode(this._pexpressionStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoPsimpleStmt(this);
    }

    public PPexpressionStmt getPexpressionStmt()
    {
        return this._pexpressionStmt_;
    }

    public void setPexpressionStmt(PPexpressionStmt node)
    {
        if(this._pexpressionStmt_ != null)
        {
            this._pexpressionStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pexpressionStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pexpressionStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pexpressionStmt_ == child)
        {
            this._pexpressionStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pexpressionStmt_ == oldChild)
        {
            setPexpressionStmt((PPexpressionStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}