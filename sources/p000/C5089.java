package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦًؘۙؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5089 extends C2094 {

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ Object f16879;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ int f16880 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5089(C3040 c3040) {
        super(20);
        this.f16879 = c3040;
    }

    @Override // p000.C2094
    /* JADX INFO: renamed from: ۥۗ */
    public void mo4038(Object obj, Object obj2, Object obj3) {
        switch (this.f16880) {
            case 0:
                C3926 c3926 = (C3926) obj2;
                ((C0322) ((C2346) this.f16879).f7786).m693((C5772) obj, c3926.f13107, c3926.f13106, c3926.f13105);
                break;
        }
    }

    @Override // p000.C2094
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo4040(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.f16880) {
            case 1:
                String str = (String) obj;
                AbstractC0487.m1090(str);
                C3040 c3040 = (C3040) this.f16879;
                c3040.m4637();
                AbstractC0487.m1090(str);
                C1159 c1159 = c3040.f19371.f16670;
                C5034.m8484(c1159);
                C5460 c5460M2440 = c1159.m2440(str);
                if (c5460M2440 == null) {
                    return null;
                }
                C3610 c3610 = ((C5371) c3040.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12023.m9430(str, "Populate EES config from database on cache miss. appId");
                c3040.m5631(str, c3040.m5628(str, (byte[]) c5460M2440.f18001));
                C5089 c5089 = c3040.f10220;
                synchronized (c5089.f6888) {
                    linkedHashMap = new LinkedHashMap(c5089.f6891.f2527.entrySet().size());
                    for (Map.Entry entry : c5089.f6891.f2527.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (C3924) linkedHashMap.get(str);
            default:
                return super.mo4040(obj);
        }
    }

    @Override // p000.C2094
    /* JADX INFO: renamed from: ۦۙ */
    public int mo4042(Object obj, Object obj2) {
        switch (this.f16880) {
            case 0:
                return ((C3926) obj2).f13105;
            default:
                return super.mo4042(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5089(int i, C2346 c2346) {
        super(i);
        this.f16879 = c2346;
    }
}
