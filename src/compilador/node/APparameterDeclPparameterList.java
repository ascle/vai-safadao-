/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APparameterDeclPparameterList extends PPparameterList
{
    private PPparameterDecl _pparameterDecl_;

    public APparameterDeclPparameterList()
    {
        // Constructor
    }

    public APparameterDeclPparameterList(
        @SuppressWarnings("hiding") PPparameterDecl _pparameterDecl_)
    {
        // Constructor
        setPparameterDecl(_pparameterDecl_);

    }

    @Override
    public Object clone()
    {
        return new APparameterDeclPparameterList(
            cloneNode(this._pparameterDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPparameterDeclPparameterList(this);
    }

    public PPparameterDecl getPparameterDecl()
    {
        return this._pparameterDecl_;
    }

    public void setPparameterDecl(PPparameterDecl node)
    {
        if(this._pparameterDecl_ != null)
        {
            this._pparameterDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pparameterDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pparameterDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pparameterDecl_ == child)
        {
            this._pparameterDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pparameterDecl_ == oldChild)
        {
            setPparameterDecl((PPparameterDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
