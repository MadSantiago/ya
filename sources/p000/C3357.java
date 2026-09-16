package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦُؖؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3357 implements InterfaceC2427, InterfaceC0151 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final EnumC2459 f11222;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC0151 f11223;

    public C3357(InterfaceC0151 interfaceC0151, EnumC2459 enumC2459) {
        this.f11223 = interfaceC0151;
        this.f11222 = enumC2459;
    }

    @Override // p000.InterfaceC0151
    public final EnumC2459 getLayoutDirection() {
        return this.f11222;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥؖ */
    public final float mo741(float f) {
        return this.f11223.mo741(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٌ */
    public final long mo742(float f) {
        return this.f11223.mo742(f);
    }

    @Override // p000.InterfaceC0151
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo323() {
        return this.f11223.mo323();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٝ */
    public final int mo743(float f) {
        return this.f11223.mo743(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥٞ */
    public final float mo744(long j) {
        return this.f11223.mo744(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo745(float f) {
        return this.f11223.mo745(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f11223.mo746();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۢ */
    public final long mo747(long j) {
        return this.f11223.mo747(j);
    }

    @Override // p000.InterfaceC2427
    /* JADX INFO: renamed from: ۥۤ */
    public final InterfaceC5370 mo748(int i, int i2, Map map, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC3480.m6278("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C5481(i, i2, map, interfaceC4745);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۦ */
    public final int mo749(long j) {
        return this.f11223.mo749(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦُ */
    public final float mo751(long j) {
        return this.f11223.mo751(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦٕ */
    public final long mo752(long j) {
        return this.f11223.mo752(j);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۖ */
    public final float mo753(float f) {
        return this.f11223.mo753(f);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f11223.mo754();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۦ */
    public final float mo756(int i) {
        return this.f11223.mo756(i);
    }
}
