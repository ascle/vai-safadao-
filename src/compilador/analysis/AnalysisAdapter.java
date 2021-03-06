/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAlogicoPbinaryExpr(AAlogicoPbinaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArelacionalPbinaryExpr(AArelacionalPbinaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADfsdPbinaryExpr(ADfsdPbinaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryLogicoExp(APbinaryLogicoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADsPbinaryLogicoExp(ADsPbinaryLogicoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryLogicoFactor(APbinaryLogicoFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADsPbinaryLogicoFactor(ADsPbinaryLogicoFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryLogicoFactorNot(APbinaryLogicoFactorNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOperandoPbinaryLogicoFactorNot(AOperandoPbinaryLogicoFactorNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryRelExp(APbinaryRelExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOperandoPbinaryRelExp(AOperandoPbinaryRelExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATigualIgualPrelOp(ATigualIgualPrelOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATmenorPrelOp(ATmenorPrelOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATmaiorPrelOp(ATmaiorPrelOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTnumero(TTnumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTnumerooctal(TTnumerooctal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTnumerohexa(TTnumerohexa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTcommentLine(TTcommentLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTcomentBloco(TTcomentBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTnomePrograma(TTnomePrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTstring(TTstring node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTespaco(TTespaco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTquebra(TTquebra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTidentacao(TTidentacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTadicao(TTadicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTsubtracao(TTsubtracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTbarra(TTbarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTestrela(TTestrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTmenor(TTmenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTmenorIgual(TTmenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTmaior(TTmaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTmaiorIgual(TTmaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTseta(TTseta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTigualIgual(TTigualIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTdiferente(TTdiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTigual(TTigual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTpontoEVirgula(TTpontoEVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTdelimitador(TTdelimitador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTvirgula(TTvirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTabreParen(TTabreParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTfechaParen(TTfechaParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTabreColchete(TTabreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTfechaColchete(TTfechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTabreChave(TTabreChave node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTfechaChave(TTfechaChave node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTabreComent(TTabreComent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTfechaComent(TTfechaComent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTponto(TTponto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTdoispontos(TTdoispontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTandLogico(TTandLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTorLogico(TTorLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTnotLogico(TTnotLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTdeclaracaoAtribuicao(TTdeclaracaoAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTellipsis(TTellipsis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTdefault(TTdefault node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTcase(TTcase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTif(TTif node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTelse(TTelse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTfunc(TTfunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTdefer(TTdefer node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTreturn(TTreturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTrange(TTrange node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTfor(TTfor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTvar(TTvar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTconst(TTconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTbool(TTbool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTint32(TTint32 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTint64(TTint64 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTtipo(TTtipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTidentifier(TTidentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTcharIgnored(TTcharIgnored node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
