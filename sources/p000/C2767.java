package p000;

import java.util.ArrayList;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۥۥؘؑۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2767 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f9183;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9184;

    public /* synthetic */ C2767(int i, Object obj) {
        this.f9184 = i;
        this.f9183 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [ۥۥؓ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ۦٔؓۥٙ] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ۥۥؓ٘ۖ] */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        float fM7922;
        C5765 c5765;
        int i = this.f9184;
        Object obj = this.f9183;
        switch (i) {
            case 0:
                C4741 c4741 = (C4741) obj;
                C5277 c5277 = c4741.f15647;
                if (c5277 == null || (c5765 = c5277.f17393) == null) {
                    fM7922 = 0.0f;
                } else {
                    float f = c5765.f19007;
                    if (f == 0.0f) {
                        fM7922 = 0.0f;
                    } else {
                        fM7922 = 1.0f - (AbstractC4554.m7922(f - c5765.f19006.m1711(), c5765.f19007, 0.0f) / c5765.f19007);
                    }
                }
                C4692 c4692 = c4741.f15648;
                return new C1327(AbstractC4225.m7450(c4692.f15457, c4692.f15456, AbstractC1074.f3760.mo1642(fM7922 <= 0.01f ? 0.0f : 1.0f)));
            case 1:
                ArrayList arrayList = ((C4265) obj).f14124;
                C3262 c3262 = new C3262(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r5 = (C4171) arrayList.get(i2);
                    Object obj2 = r5.f13883;
                    int i3 = r5.f13884;
                    Object c1279 = obj2 != null ? new C1279(Integer.valueOf(i3), r5.f13883) : Integer.valueOf(i3);
                    int iM6017 = c3262.m6017(c1279);
                    boolean z = iM6017 < 0;
                    Object obj3 = z ? null : c3262.f10944[iM6017];
                    if (obj3 != null) {
                        if (obj3 instanceof C2730) {
                            ?? r9 = (C2730) obj3;
                            r9.m5079(r5);
                            r5 = r9;
                        } else {
                            Object[] objArr = AbstractC3667.f12261;
                            ?? c2730 = new C2730(2);
                            c2730.m5079(obj3);
                            c2730.m5079(r5);
                            r5 = c2730;
                        }
                    }
                    if (z) {
                        int i4 = ~iM6017;
                        c3262.f10947[i4] = c1279;
                        c3262.f10944[i4] = r5;
                    } else {
                        c3262.f10944[iM6017] = r5;
                    }
                }
                return new C5217(c3262);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return AbstractC1631.m3411((SideActivity) obj).m4427(AbstractC5041.m8557(C2197.class), null, null);
            default:
                return new AbstractC3750[((InterfaceC4707[]) obj).length];
        }
    }
}
