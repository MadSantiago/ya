package p000;

/* JADX INFO: renamed from: ۥٌِؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0894 implements InterfaceC1116 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f3238;

    public C0894(String str) {
        this.f3238 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0894) {
            return AbstractC3831.m6874(this.f3238, ((C0894) obj).f3238);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3238.hashCode();
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("UrlAnnotation(url="), this.f3238, ')');
    }
}
