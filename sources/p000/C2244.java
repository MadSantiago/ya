package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥۙۗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2244 extends AbstractC2724 {

    /* JADX INFO: renamed from: ۥۧ */
    public C3131 f7439;

    /* JADX INFO: renamed from: ۦۗ */
    public Integer f7446;

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayList f7447 = new ArrayList();

    /* JADX INFO: renamed from: ۥۜ */
    public final ArrayList f7438 = new ArrayList();

    /* JADX INFO: renamed from: ۦٛ */
    public final LinkedHashSet f7445 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦِ */
    public final LinkedHashSet f7442 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦؚ */
    public final LinkedHashSet f7440 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦٌ */
    public final LinkedHashSet f7441 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦۚ */
    public final LinkedHashSet f7448 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦۨ */
    public final LinkedHashSet f7451 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦ۟ */
    public final LinkedHashSet f7450 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥْ */
    public final LinkedHashSet f7433 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥٓ */
    public final ArrayList f7434 = new ArrayList();

    /* JADX INFO: renamed from: ۥَ */
    public final ArrayList f7432 = new ArrayList();

    /* JADX INFO: renamed from: ۥٖ */
    public final LinkedHashSet f7435 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦٗ */
    public final LinkedHashSet f7444 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦۛ */
    public final LinkedHashSet f7449 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥۖ */
    public final LinkedHashSet f7437 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۦٕ */
    public final LinkedHashSet f7443 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥٙ */
    public final LinkedHashSet f7436 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥؖ */
    public final LinkedHashSet f7431 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥؓ */
    public final LinkedHashSet f7430 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥۗ */
    public final List m4293() {
        C4229 c4229 = this.f9028;
        if (c4229 != null) {
            return AbstractC5537.m9251(this, c4229, c4229.f14030, new C0519(5, this, c4229));
        }
        C1078.m2272("You must provide a configuration to resolve the member use build(configuration).");
        return null;
    }

    @Override // p000.AbstractC2724
    /* JADX INFO: renamed from: ۥۣ */
    public final Map mo4294() {
        Map mapMo4294 = super.mo4294();
        Map mapM7919 = AbstractC4554.m7919(new C3869("parameters", this.f7447), new C3869("parametersNot", this.f7438), new C3869("parametersCondition", null), new C3869("parameterCount", this.f7446), new C3869("parameterCountCondition", null), new C3869("typeParameters", this.f7445), new C3869("typeParametersNot", this.f7442), new C3869("exceptionTypes", this.f7440), new C3869("exceptionTypesNot", this.f7441), new C3869("genericExceptionTypes", this.f7448), new C3869("genericExceptionTypesNot", this.f7451), new C3869("genericParameters", this.f7450), new C3869("genericParametersNot", this.f7433), new C3869("isVarArgs", null), new C3869("isVarArgsNot", null), new C3869("parameterAnnotations", this.f7434), new C3869("parameterAnnotationsNot", this.f7432), new C3869("annotatedReturnType", this.f7435), new C3869("annotatedReturnTypeNot", this.f7444), new C3869("annotatedReceiverType", this.f7449), new C3869("annotatedReceiverTypeNot", this.f7437), new C3869("annotatedParameterTypes", this.f7443), new C3869("annotatedParameterTypesNot", this.f7436), new C3869("annotatedExceptionTypes", this.f7431), new C3869("annotatedExceptionTypesNot", this.f7430));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo4294);
        linkedHashMap.putAll(mapM7919);
        Map mapM79110 = AbstractC4554.m7919(new C3869("returnType", this.f7439), new C3869("returnTypeCondition", null), new C3869("genericReturnType", null), new C3869("genericReturnTypeCondition", null), new C3869("isBridge", null), new C3869("isBridgeNot", null), new C3869("isDefault", null), new C3869("isDefaultNot", null), new C3869("defaultValue", null), new C3869("defaultValueCondition", null));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.putAll(mapM79110);
        return linkedHashMap2;
    }
}
