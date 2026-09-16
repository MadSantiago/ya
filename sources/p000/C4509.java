package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦؚٙؗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4509 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ۥْ */
    public float f14902;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C0851 f14903;

    /* JADX INFO: renamed from: ۦ۟ */
    public float f14904;

    /* JADX INFO: renamed from: ۦۨ */
    public EnumC2459 f14905 = EnumC2459.f8214;

    public C4509(C0851 c0851) {
        this.f14903 = c0851;
    }

    @Override // p000.InterfaceC0151
    public final EnumC2459 getLayoutDirection() {
        return this.f14905;
    }

    @Override // p000.InterfaceC0151
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo323() {
        int i = this.f14903.f3155.f2261.f4244;
        return i == 4 || i == 2;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f14904;
    }

    @Override // p000.InterfaceC2427
    /* JADX INFO: renamed from: ۥۤ */
    public final InterfaceC5370 mo748(int i, int i2, Map map, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC3480.m6278("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C5482(i, i2, map, interfaceC4745, this, this.f14903, interfaceC4746);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    @Override // p000.InterfaceC1422
    /* JADX INFO: renamed from: ۦؖ */
    public final List mo750(InterfaceC5731 interfaceC5731, Object obj) {
        Object obj2;
        C0851 c0851 = this.f14903;
        c0851.m1811();
        C0605 c0605 = c0851.f3155;
        int i = c0605.f2261.f4244;
        if (i != 1 && i != 3 && i != 2 && i != 4) {
            AbstractC3480.m6278("subcompose can only be used inside the measure or layout blocks");
        }
        C3262 c3262 = c0851.f3151;
        Object objM6027 = c3262.m6027(obj);
        if (objM6027 == null) {
            objM6027 = (C0605) c0851.f3150.m6026(obj);
            if (objM6027 != null) {
                if (c0851.f3142 <= 0) {
                    AbstractC3480.m6278("Check failed.");
                }
                c0851.f3142--;
            } else {
                objM6027 = c0851.m1812(obj);
                if (objM6027 == null) {
                    int i2 = c0851.f3145;
                    C0605 c0606 = new C0605(2);
                    c0605.f2245 = true;
                    c0605.m1343(i2, c0606);
                    c0605.f2245 = false;
                    objM6027 = c0606;
                }
            }
            c3262.m6023(obj, objM6027);
        }
        C0605 c0607 = (C0605) objM6027;
        List listM1368 = c0605.m1368();
        int i3 = c0851.f3145;
        if (i3 >= 0) {
            C3482 c3482 = (C3482) listM1368;
            if (i3 < ((C0863) c3482.f11560).f3180) {
                obj2 = c3482.get(i3);
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 != c0607) {
            int iM1849 = ((C0863) ((C3482) c0605.m1368()).f11560).m1849(c0607);
            if (iM1849 < c0851.f3145) {
                AbstractC3480.m6279("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i4 = c0851.f3145;
            if (i4 != iM1849) {
                c0851.m1808(iM1849, i4);
            }
        }
        c0851.f3145++;
        c0851.m1807(c0607, obj, false, interfaceC5731);
        return (i == 1 || i == 3) ? c0607.m1352() : c0607.m1351();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f14902;
    }
}
