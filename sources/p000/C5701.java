package p000;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: ۦۥؓ۟ؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5701 implements InterfaceC2387 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Type f18774;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18775;

    public /* synthetic */ C5701(int i, Type type) {
        this.f18775 = i;
        this.f18774 = type;
    }

    @Override // p000.InterfaceC2387
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo4464(C0724 c0724) {
        switch (this.f18775) {
            case 0:
                C2992 c2992 = new C2992(c0724);
                c0724.mo1599(new C5066(c2992, 0));
                return c2992;
            default:
                C2992 c2993 = new C2992(c0724);
                c0724.mo1599(new C5066(c2993, 1));
                return c2993;
        }
    }

    @Override // p000.InterfaceC2387
    /* JADX INFO: renamed from: ۦؑ */
    public final Type mo4465() {
        int i = this.f18775;
        return this.f18774;
    }
}
