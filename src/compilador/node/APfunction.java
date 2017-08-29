/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class APfunction extends PPfunction
{
    private PPsignature _psignature_;
    private PPfunctionBody _pfunctionBody_;

    public APfunction()
    {
        // Constructor
    }

    public APfunction(
        @SuppressWarnings("hiding") PPsignature _psignature_,
        @SuppressWarnings("hiding") PPfunctionBody _pfunctionBody_)
    {
        // Constructor
        setPsignature(_psignature_);

        setPfunctionBody(_pfunctionBody_);

    }

    @Override
    public Object clone()
    {
        return new APfunction(
            cloneNode(this._psignature_),
            cloneNode(this._pfunctionBody_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPfunction(this);
    }

    public PPsignature getPsignature()
    {
        return this._psignature_;
    }

    public void setPsignature(PPsignature node)
    {
        if(this._psignature_ != null)
        {
            this._psignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._psignature_ = node;
    }

    public PPfunctionBody getPfunctionBody()
    {
        return this._pfunctionBody_;
    }

    public void setPfunctionBody(PPfunctionBody node)
    {
        if(this._pfunctionBody_ != null)
        {
            this._pfunctionBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pfunctionBody_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._psignature_)
            + toString(this._pfunctionBody_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._psignature_ == child)
        {
            this._psignature_ = null;
            return;
        }

        if(this._pfunctionBody_ == child)
        {
            this._pfunctionBody_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._psignature_ == oldChild)
        {
            setPsignature((PPsignature) newChild);
            return;
        }

        if(this._pfunctionBody_ == oldChild)
        {
            setPfunctionBody((PPfunctionBody) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}