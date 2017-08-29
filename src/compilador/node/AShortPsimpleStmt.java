/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AShortPsimpleStmt extends PPsimpleStmt
{
    private PPshortpvarDecl _pshortpvarDecl_;

    public AShortPsimpleStmt()
    {
        // Constructor
    }

    public AShortPsimpleStmt(
        @SuppressWarnings("hiding") PPshortpvarDecl _pshortpvarDecl_)
    {
        // Constructor
        setPshortpvarDecl(_pshortpvarDecl_);

    }

    @Override
    public Object clone()
    {
        return new AShortPsimpleStmt(
            cloneNode(this._pshortpvarDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAShortPsimpleStmt(this);
    }

    public PPshortpvarDecl getPshortpvarDecl()
    {
        return this._pshortpvarDecl_;
    }

    public void setPshortpvarDecl(PPshortpvarDecl node)
    {
        if(this._pshortpvarDecl_ != null)
        {
            this._pshortpvarDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pshortpvarDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pshortpvarDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pshortpvarDecl_ == child)
        {
            this._pshortpvarDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pshortpvarDecl_ == oldChild)
        {
            setPshortpvarDecl((PPshortpvarDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}