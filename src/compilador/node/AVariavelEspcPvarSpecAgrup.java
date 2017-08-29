/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AVariavelEspcPvarSpecAgrup extends PPvarSpecAgrup
{
    private PPtype _ptype_;
    private PPvarSpecAgrupOpc _pvarSpecAgrupOpc_;

    public AVariavelEspcPvarSpecAgrup()
    {
        // Constructor
    }

    public AVariavelEspcPvarSpecAgrup(
        @SuppressWarnings("hiding") PPtype _ptype_,
        @SuppressWarnings("hiding") PPvarSpecAgrupOpc _pvarSpecAgrupOpc_)
    {
        // Constructor
        setPtype(_ptype_);

        setPvarSpecAgrupOpc(_pvarSpecAgrupOpc_);

    }

    @Override
    public Object clone()
    {
        return new AVariavelEspcPvarSpecAgrup(
            cloneNode(this._ptype_),
            cloneNode(this._pvarSpecAgrupOpc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariavelEspcPvarSpecAgrup(this);
    }

    public PPtype getPtype()
    {
        return this._ptype_;
    }

    public void setPtype(PPtype node)
    {
        if(this._ptype_ != null)
        {
            this._ptype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ptype_ = node;
    }

    public PPvarSpecAgrupOpc getPvarSpecAgrupOpc()
    {
        return this._pvarSpecAgrupOpc_;
    }

    public void setPvarSpecAgrupOpc(PPvarSpecAgrupOpc node)
    {
        if(this._pvarSpecAgrupOpc_ != null)
        {
            this._pvarSpecAgrupOpc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pvarSpecAgrupOpc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ptype_)
            + toString(this._pvarSpecAgrupOpc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ptype_ == child)
        {
            this._ptype_ = null;
            return;
        }

        if(this._pvarSpecAgrupOpc_ == child)
        {
            this._pvarSpecAgrupOpc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ptype_ == oldChild)
        {
            setPtype((PPtype) newChild);
            return;
        }

        if(this._pvarSpecAgrupOpc_ == oldChild)
        {
            setPvarSpecAgrupOpc((PPvarSpecAgrupOpc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}