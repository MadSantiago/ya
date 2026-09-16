package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥۦؔۦٌ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2805 implements InterfaceC4617, InterfaceC4137 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C3223 f9360 = new C3223(1);

    /* JADX INFO: renamed from: ۦۨ */
    public final C5362 f9361;

    public C2805(C5362 c5362) {
        this.f9361 = c5362;
    }

    @Override // p000.InterfaceC4137
    public final InterfaceC2218 getKey() {
        return f9360;
    }

    @Override // p000.InterfaceC4617
    /* JADX INFO: renamed from: ۥؗ */
    public final List mo5325(Integer num) {
        return this.f9361.m8966();
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final /* bridge */ InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6745(this, interfaceC2218);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        return interfaceC5731.mo219(obj, this);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final /* bridge */ InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6798(this, interfaceC2218);
    }

    @Override // p000.InterfaceC4617
    /* JADX INFO: renamed from: ۦۙ */
    public final boolean mo5326() {
        return this.f9361.f17646;
    }
}
