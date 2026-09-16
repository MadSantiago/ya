package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥۥٟۣؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2749 extends AbstractC2724 {

    /* JADX INFO: renamed from: ۦۙ */
    public C4215 f9096;

    /* JADX INFO: renamed from: ۥۗ */
    public final List m5108() {
        C4229 c4229 = this.f9028;
        if (c4229 != null) {
            return AbstractC5537.m9251(this, c4229, c4229.f14030, new C0519(6, this, c4229));
        }
        C1078.m2272("You must provide a configuration to resolve the member use build(configuration).");
        return null;
    }

    @Override // p000.AbstractC2724
    /* JADX INFO: renamed from: ۥۣ */
    public final Map mo4294() {
        Map mapMo4294 = super.mo4294();
        Map mapM7919 = AbstractC4554.m7919(new C3869("isEnumConstant", null), new C3869("isEnumConstantNot", null), new C3869("type", null), new C3869("typeCondition", this.f9096), new C3869("genericType", null), new C3869("genericTypeCondition", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo4294);
        linkedHashMap.putAll(mapM7919);
        return linkedHashMap;
    }
}
