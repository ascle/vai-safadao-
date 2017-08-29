/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AItervaloPforStmtOpc extends PPforStmtOpc
{
    private PPrangeClause _prangeClause_;

    public AItervaloPforStmtOpc()
    {
        // Constructor
    }

    public AItervaloPforStmtOpc(
        @SuppressWarnings("hiding") PPrangeClause _prangeClause_)
    {
        // Constructor
        setPrangeClause(_prangeClause_);

    }

    @Override
    public Object clone()
    {
        return new AItervaloPforStmtOpc(
            cloneNode(this._prangeClause_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAItervaloPforStmtOpc(this);
    }

    public PPrangeClause getPrangeClause()
    {
        return this._prangeClause_;
    }

    public void setPrangeClause(PPrangeClause node)
    {
        if(this._prangeClause_ != null)
        {
            this._prangeClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prangeClause_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prangeClause_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prangeClause_ == child)
        {
            this._prangeClause_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prangeClause_ == oldChild)
        {
            setPrangeClause((PPrangeClause) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
