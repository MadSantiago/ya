package p000;

/* JADX INFO: renamed from: ۦٍؕٛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3792 extends C0390 {

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f12592;

    public C3792(C0322 c0322, boolean z) {
        super(c0322);
        this.f12592 = z;
    }

    @Override // p000.C0390
    /* JADX INFO: renamed from: ۥّ */
    public final void mo905(int i) {
        boolean z = this.f12592;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo911(unsignedString);
        } else {
            m907(unsignedString);
        }
    }

    @Override // p000.C0390
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo909(byte b) {
        if (this.f12592) {
            mo911(String.valueOf(b & 255));
        } else {
            m907(String.valueOf(b & 255));
        }
    }

    @Override // p000.C0390
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo912(short s) {
        if (this.f12592) {
            mo911(String.valueOf(s & 65535));
        } else {
            m907(String.valueOf(s & 65535));
        }
    }

    @Override // p000.C0390
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo914(long j) {
        boolean z = this.f12592;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo911(unsignedString);
        } else {
            m907(unsignedString);
        }
    }
}
