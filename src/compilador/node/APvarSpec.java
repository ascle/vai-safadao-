/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APvarSpec extends PPvarSpec
{
    private PPidentifierList _pidentifierList_;
    private PPvarSpecAgrup _pvarSpecAgrup_;

    public APvarSpec()
    {
        // Constructor
    }

    public APvarSpec(
        @SuppressWarnings("hiding") PPidentifierList _pidentifierList_,
        @SuppressWarnings("hiding") PPvarSpecAgrup _pvarSpecAgrup_)
    {
        // Constructor
        setPidentifierList(_pidentifierList_);

        setPvarSpecAgrup(_pvarSpecAgrup_);

    }

    @Override
    public Object clone()
    {
        return new APvarSpec(
            cloneNode(this._pidentifierList_),
            cloneNode(this._pvarSpecAgrup_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPvarSpec(this);
    }

    public PPidentifierList getPidentifierList()
    {
        return this._pidentifierList_;
    }

    public void setPidentifierList(PPidentifierList node)
    {
        if(this._pidentifierList_ != null)
        {
            this._pidentifierList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pidentifierList_ = node;
    }

    public PPvarSpecAgrup getPvarSpecAgrup()
    {
        return this._pvarSpecAgrup_;
    }

    public void setPvarSpecAgrup(PPvarSpecAgrup node)
    {
        if(this._pvarSpecAgrup_ != null)
        {
            this._pvarSpecAgrup_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pvarSpecAgrup_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pidentifierList_)
            + toString(this._pvarSpecAgrup_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pidentifierList_ == child)
        {
            this._pidentifierList_ = null;
            return;
        }

        if(this._pvarSpecAgrup_ == child)
        {
            this._pvarSpecAgrup_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pidentifierList_ == oldChild)
        {
            setPidentifierList((PPidentifierList) newChild);
            return;
        }

        if(this._pvarSpecAgrup_ == oldChild)
        {
            setPvarSpecAgrup((PPvarSpecAgrup) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
