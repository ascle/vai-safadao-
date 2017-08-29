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
    public void caseAPprogramLoopPprogram(APprogramLoopPprogram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPprogramLoop(APprogramLoop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPdeclarationPtopLevelDecl(APdeclarationPtopLevelDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunctionDeclPtopLevelDecl(APfunctionDeclPtopLevelDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPmethodDeclPtopLevelDecl(APmethodDeclPtopLevelDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconstDeclPdeclaration(APconstDeclPdeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPvarDeclPdeclaration(APvarDeclPdeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunctionDecl(APfunctionDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunctionPfunctionDeclAgrup(APfunctionPfunctionDeclAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPsignaturePfunctionDeclAgrup(APsignaturePfunctionDeclAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunctionName(APfunctionName node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunction(APfunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunctionBody(APfunctionBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPmethodDecl(APmethodDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunctionPmethodDeclAgrup(APfunctionPmethodDeclAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPsignaturePmethodDeclAgrup(APsignaturePmethodDeclAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPreceiver(APreceiver node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPmethodName(APmethodName node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPparameters(APparameters node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPparametersOp(APparametersOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPparameterListLoopPparameterList(APparameterListLoopPparameterList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPparameterDeclPparameterList(APparameterDeclPparameterList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPparameterListLoop(APparameterListLoop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPparameterDecl(APparameterDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPidentifierListPidentifierList(APidentifierListPidentifierList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPidentifierList(APidentifierList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconstDecl(APconstDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconstSpecIdentPconstDecl2(APconstSpecIdentPconstDecl2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconstDecl2(APconstDecl2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconstDeclConteudoPconstDecl3(APconstDeclConteudoPconstDecl3 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconstDeclConteudo(APconstDeclConteudo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconstSpecIdent(APconstSpecIdent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconstSpec2PconstSpec(APconstSpec2PconstSpec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPtypePconstSpec2(APtypePconstSpec2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPexpressionListLoopPexpressionList(APexpressionListLoopPexpressionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPexpressionList(APexpressionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPexpressionListLoop(APexpressionListLoop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPunaryExprPexpression(APunaryExprPexpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPexpression(APexpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryLogicoExpPbinaryExpr(APbinaryLogicoExpPbinaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryRelExpPbinaryExpr(APbinaryRelExpPbinaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryAritExpPbinaryExpr(APbinaryAritExpPbinaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPprimaryExprPunaryExpr(APprimaryExprPunaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPunaryExpr(APunaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATadicaoPunaryOp(ATadicaoPunaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATsubtracaoPunaryOp(ATsubtracaoPunaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATnotLogicoPunaryOp(ATnotLogicoPunaryOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryLogicoExp(APbinaryLogicoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryLogicoFactor(APbinaryLogicoFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryLogicoTermo(APbinaryLogicoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATidentifierPbinaryLogicoTermo(ATidentifierPbinaryLogicoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryRelExp(APbinaryRelExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryRelTermo(APbinaryRelTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATidentifierPbinaryRelTermo(ATidentifierPbinaryRelTermo node)
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
    public void caseAPbinaryAritExp(APbinaryAritExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryAritFactor(APbinaryAritFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbinaryAritTermo(APbinaryAritTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATsubtracaoPbinaryAritTermo(ATsubtracaoPbinaryAritTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATadicaoPaddOp(ATadicaoPaddOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATsubtracaoPaddOp(ATsubtracaoPaddOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATestrelaPmulOp(ATestrelaPmulOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATbarraPmulOp(ATbarraPmulOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPtypeNamePtype(APtypeNamePtype node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPtypeListPtype(APtypeListPtype node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPtype(APtype node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPtypeName(APtypeName node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoArrayPtypeList(ATipoArrayPtypeList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoFuncaoPtypeList(ATipoFuncaoPtypeList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParrayType(AParrayType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParrayLength(AParrayLength node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPelementType(APelementType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunctionptype(APfunctionptype node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPsignature(APsignature node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosPresult(AParametrosPresult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoPresult(ATipoPresult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPparametersOpcional(APparametersOpcional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaVariavelPvarDecl(ADeclaVariavelPvarDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaGrupoPvarDeclAgrup(ADeclaGrupoPvarDeclAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPvarDeclAgrup(APvarDeclAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPvarDeclAgrupLoopPvarDeclAgrupParen(APvarDeclAgrupLoopPvarDeclAgrupParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPvarDeclAgrupLoop(APvarDeclAgrupLoop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPvarSpec(APvarSpec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelEspcPvarSpecAgrup(AVariavelEspcPvarSpecAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPvarSpecAgrup(APvarSpecAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPvarSpecAgrupOpc(APvarSpecAgrupOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoPrimaPprimaryExpr(AExpressaoPrimaPprimaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConversaoPprimaryExpr(AConversaoPprimaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIndicePprimaryExpr(AIndicePprimaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArgumentosPprimaryExpr(AArgumentosPprimaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALiteralPoperand(ALiteralPoperand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATidentifierPoperand(ATidentifierPoperand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATabreParenPoperand(ATabreParenPoperand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABaseLiteralPliteral(ABaseLiteralPliteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompositeLiteralPliteral(ACompositeLiteralPliteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncaoListPliteral(AFuncaoListPliteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPbasicLit(APbasicLit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPcompositeLit(APcompositeLit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPliteralType(APliteralType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATabreColchetePliteralType(ATabreColchetePliteralType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPliteralValue(APliteralValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPliteralValueOpc(APliteralValueOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElementoLoopPelementLit(AElementoLoopPelementLit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPelementLit(APelementLit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPelementLitLoop(APelementLitLoop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPkeyedElement(APkeyedElement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPkeyedElementOpc(APkeyedElementOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANmeCampoPkey(ANmeCampoPkey node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoPkey(AExpressaoPkey node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorLiteralPkey(AValorLiteralPkey node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfieldName(APfieldName node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoPelement(AExpressaoPelement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPelement(APelement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPfunctionList(APfunctionList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPconversion(APconversion node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPindex(APindex node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParguments(AParguments node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPargumentsCorpo(APargumentsCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpressaoPargumentsCorpoAgrup(AListaExpressaoPargumentsCorpoAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoPargumentsCorpoAgrup(ATipoPargumentsCorpoAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPblock(APblock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPstatementListLoopPstatementList(APstatementListLoopPstatementList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPstatementListLoop(APstatementListLoop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoPstatement(ADeclaracaoPstatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmlSimplesPstatement(AStmlSimplesPstatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARetornoPstatement(ARetornoPstatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoPstatement(ABlocoPstatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfPstatement(AIfPstatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForPstatement(AForPstatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioPsimpleStmt(AVazioPsimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoPsimpleStmt(AExpressaoPsimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssigmentPsimpleStmt(AAssigmentPsimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAShortPsimpleStmt(AShortPsimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPemptyStmt(APemptyStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPexpressionStmt(APexpressionStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpressaoPassignment(AListaExpressaoPassignment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPassignmentFator(APassignmentFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPshortpvarDecl(APshortpvarDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPreturnStmt(APreturnStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPifStmt(APifStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPifStmtOpc(APifStmtOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPelse(APelse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfPelseAgrup(AIfPelseAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoPelseAgrup(ABlocoPelseAgrup node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPforStmt(APforStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondicaoPforStmtOpc(ACondicaoPforStmtOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAClusuraForPforStmtOpc(AClusuraForPforStmtOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAItervaloPforStmtOpc(AItervaloPforStmtOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPcondition(APcondition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPforClause(APforClause node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPforClauseFator(APforClauseFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrangeClause(APrangeClause node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpressaoPrangeClauseOpc(AListaExpressaoPrangeClauseOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentificadorListaPrangeClauseOpc(AIdentificadorListaPrangeClauseOpc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPinitStmt(APinitStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPpostStmt(APpostStmt node)
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