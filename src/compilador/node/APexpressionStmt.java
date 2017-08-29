/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APexpressionStmt extends PPexpressionStmt
{
    private PPexpression _pexpression_;

    public APexpressionStmt()
    {
        // Constructor
    }

    public APexpressionStmt(
        @SuppressWarnings("hiding") PPexpression _pexpression_)
    {
        // Constructor
        setPexpression(_pexpression_);

    }

    @Override
    public Object clone()
    {
        return new APexpressionStmt(
            cloneNode(this._pexpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPexpressionStmt(this);
    }

    public PPexpression getPexpression()
    {
        return this._pexpression_;
    }

    public void setPexpression(PPexpression node)
    {
        if(this._pexpression_ != null)
        {
            this._pexpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pexpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pexpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pexpression_ == child)
        {
            this._pexpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pexpression_ == oldChild)
        {
            setPexpression((PPexpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}