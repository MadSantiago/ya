package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥؓؕۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0329 implements InterfaceC1422, InterfaceC2427 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0851 f1229;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C4509 f1230;

    public C0329(C0851 c0851) {
        this.f1229 = c0851;
        this.f1230 = c0851.f3153;
    }

    @Override // p000.InterfaceC0151
    public final EnumC2459 getLayoutDirection() {
        return this.f1230.f14905;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥؖ */
    public final float mo741(float f) {
        return this.f1230.mo746() * f;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٌ */
    public final long mo742(float f) {
        return this.f1230.mo742(f);
    }

    @Override // p000.InterfaceC0151
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo323() {
        return this.f1230.mo323();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٝ */
    public final int mo743(float f) {
        return this.f1230.mo743(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٞ */
    public final float mo744(long j) {
        return this.f1230.mo744(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo745(float f) {
        return this.f1230.mo745(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f1230.f14904;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۢ */
    public final long mo747(long j) {
        return this.f1230.mo747(j);
    }

    @Override // p000.InterfaceC2427
    /* JADX INFO: renamed from: ۥۤ */
    public final InterfaceC5370 mo748(int i, int i2, Map map, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        return this.f1230.mo748(i, i2, map, interfaceC4745, interfaceC4746);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۦ */
    public final int mo749(long j) {
        return this.f1230.mo749(j);
    }

    @Override // p000.InterfaceC1422
    /* JADX INFO: renamed from: ۦؖ */
    public final List mo750(InterfaceC5731 interfaceC5731, Object obj) {
        C0851 c0851 = this.f1229;
        C0605 c0605 = c0851.f3155;
        C3262 c3262 = c0851.f3151;
        C0605 c0606 = (C0605) c3262.m6027(obj);
        if (c0606 != null && ((C0863) ((C3482) c0605.m1368()).f11560).m1849(c0606) < c0851.f3145) {
            return c0606.m1352();
        }
        C3262 c3263 = c0851.f3141;
        C3262 c3264 = c0851.f3150;
        C0863 c0863 = c0851.f3140;
        if (c0863.f3180 < c0851.f3143) {
            AbstractC3480.m6279("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C0605 c0607 = (C0605) c3262.m6027(obj);
        int i = c0863.f3180;
        int i2 = c0851.f3143;
        if (i == i2) {
            c0863.m1843(obj);
        } else {
            Object[] objArr = c0863.f3182;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        c0851.f3143++;
        boolean zM6018 = c3264.m6018(obj);
        if (zM6018 || c0607 != null) {
            if (!zM6018 && c0607 != null) {
                c0851.m1808(((C0863) ((C3482) c0605.m1368()).f11560).m1849(c0607), ((C0863) ((C3482) c0605.m1368()).f11560).f3180);
                c0851.f3142++;
                c3262.m6026(obj);
                c3264.m6023(obj, c0607);
                c3263.m6023(obj, c0851.m1802(obj));
                if (c0605.m1348()) {
                    c0851.m1811();
                }
            }
            C0605 c0608 = (C0605) c3264.m6027(obj);
            C1325 c1325 = c0608 != null ? (C1325) c0851.f3146.m6027(c0608) : null;
            if (c1325 != null && c1325.f4580) {
                c0851.m1807(c0608, obj, false, interfaceC5731);
            }
            if ((c1325 != null ? c1325.f4576 : null) != null) {
                c0851.m1804(c1325, true);
            }
        } else {
            c0851.m1810(obj, interfaceC5731, false);
            c3263.m6023(obj, c0851.m1802(obj));
        }
        C0605 c0609 = (C0605) c3264.m6027(obj);
        if (c0609 == null) {
            return C2340.f7777;
        }
        List listM4386 = c0609.f2261.f4252.m4386();
        C3482 c3482 = (C3482) listM4386;
        int i3 = ((C0863) c3482.f11560).f3180;
        for (int i4 = 0; i4 < i3; i4++) {
            ((C2339) c3482.get(i4)).f7752.f4241 = true;
        }
        return listM4386;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦُ */
    public final float mo751(long j) {
        return this.f1230.mo751(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦٕ */
    public final long mo752(long j) {
        return this.f1230.mo752(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۖ */
    public final float mo753(float f) {
        return f / this.f1230.mo746();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f1230.f14902;
    }

    @Override // p000.InterfaceC2427
    /* JADX INFO: renamed from: ۦۤ */
    public final InterfaceC5370 mo755(int i, int i2, Map map, InterfaceC4745 interfaceC4745) {
        return this.f1230.mo748(i, i2, map, null, interfaceC4745);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۦ */
    public final float mo756(int i) {
        return this.f1230.mo756(i);
    }
}
