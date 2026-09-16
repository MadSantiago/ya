package p000;

/* JADX INFO: renamed from: ۥٟۚؓۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2268 implements InterfaceC4120 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C2268 f7525;

    /* JADX INFO: renamed from: ۥْ */
    public int f7526;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f7527;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7528;

    static {
        int i = 0;
        f7525 = new C2268(i, i, 0);
    }

    public C2268(C2268 c2268) {
        this.f7528 = 4;
        this.f7527 = c2268.f7527;
        this.f7526 = c2268.f7526;
    }

    public String toString() {
        switch (this.f7528) {
            case 0:
                StringBuilder sb = new StringBuilder(C2268.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.f7527);
                sb.append(", length = ");
                return AbstractC3761.m6630(this.f7526, "]", sb);
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC4120
    /* JADX INFO: renamed from: ۥّ */
    public int mo4318(int i) {
        if (i >= 0 && i <= this.f7526) {
            AbstractC3933.m7093(i, this.f7527, i);
        }
        return i;
    }

    @Override // p000.InterfaceC4120
    /* JADX INFO: renamed from: ۦۙ */
    public int mo4319(int i) {
        if (i >= 0 && i <= this.f7527) {
            AbstractC3933.m7090(i, this.f7526, i);
        }
        return i;
    }

    public /* synthetic */ C2268(int i, byte b) {
        this.f7528 = i;
    }

    public /* synthetic */ C2268(int i, int i2, int i3) {
        this.f7528 = i3;
        this.f7527 = i;
        this.f7526 = i2;
    }

    public C2268(int i) {
        this.f7528 = 6;
        this.f7527 = 2;
        this.f7526 = i;
    }
}
