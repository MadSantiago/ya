package p000;

/* JADX INFO: renamed from: ۦۘؕۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC4061
@InterfaceC1172
public final class C5032 {
    public static final C4414 Companion = new C4414();

    /* JADX INFO: renamed from: ۥۣ */
    public final String f16660;

    public /* synthetic */ C5032(int i, String str) {
        if (1 == (i & 1)) {
            this.f16660 = str;
        } else {
            AbstractC5568.m9392(i, 1, C5748.f18960.mo193());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5032) && AbstractC3831.m6874(this.f16660, ((C5032) obj).f16660);
    }

    public final int hashCode() {
        return this.f16660.hashCode();
    }

    public final String toString() {
        return AbstractC3761.m6629("AssetsData(browserDownloadUrl=", this.f16660, ")");
    }
}
