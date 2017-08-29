/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APbasicLit extends PPbasicLit
{
    private TTnumero _tnumero_;

    public APbasicLit()
    {
        // Constructor
    }

    public APbasicLit(
        @SuppressWarnings("hiding") TTnumero _tnumero_)
    {
        // Constructor
        setTnumero(_tnumero_);

    }

    @Override
    public Object clone()
    {
        return new APbasicLit(
            cloneNode(this._tnumero_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPbasicLit(this);
    }

    public TTnumero getTnumero()
    {
        return this._tnumero_;
    }

    public void setTnumero(TTnumero node)
    {
        if(this._tnumero_ != null)
        {
            this._tnumero_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tnumero_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tnumero_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tnumero_ == child)
        {
            this._tnumero_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tnumero_ == oldChild)
        {
            setTnumero((TTnumero) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
