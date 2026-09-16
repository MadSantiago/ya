package p000;

/* JADX INFO: renamed from: ۥٟؔ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2002 implements InterfaceC4137, InterfaceC2218 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6600;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C4036 f6599 = new C4036(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final C2002 f6598 = new C2002(1);

    public /* synthetic */ C2002(int i) {
        this.f6600 = i;
    }

    @Override // p000.InterfaceC4137
    public final InterfaceC2218 getKey() {
        switch (this.f6600) {
            case 0:
                return f6599;
            default:
                return this;
        }
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        switch (this.f6600) {
            case 0:
                break;
        }
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final /* bridge */ InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        switch (this.f6600) {
            case 0:
                break;
        }
        return AbstractC3801.m6745(this, interfaceC2218);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        switch (this.f6600) {
            case 0:
                break;
        }
        return interfaceC5731.mo219(obj, this);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final /* bridge */ InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        switch (this.f6600) {
            case 0:
                break;
        }
        return AbstractC3801.m6798(this, interfaceC2218);
    }
}
