/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APtypeListPtype extends PPtype
{
    private PPtypeList _ptypeList_;

    public APtypeListPtype()
    {
        // Constructor
    }

    public APtypeListPtype(
        @SuppressWarnings("hiding") PPtypeList _ptypeList_)
    {
        // Constructor
        setPtypeList(_ptypeList_);

    }

    @Override
    public Object clone()
    {
        return new APtypeListPtype(
            cloneNode(this._ptypeList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPtypeListPtype(this);
    }

    public PPtypeList getPtypeList()
    {
        return this._ptypeList_;
    }

    public void setPtypeList(PPtypeList node)
    {
        if(this._ptypeList_ != null)
        {
            this._ptypeList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ptypeList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ptypeList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ptypeList_ == child)
        {
            this._ptypeList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ptypeList_ == oldChild)
        {
            setPtypeList((PPtypeList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
