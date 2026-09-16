package p000;

/* JADX INFO: renamed from: ۦؑۛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3075 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0215 f10322;

    public C3075(InterfaceC0215 interfaceC0215) {
        this.f10322 = interfaceC0215;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3075) {
            return Float.compare(0.0f, 0.0f) == 0 && AbstractC3831.m6874(this.f10322, ((C3075) obj).f10322);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10322.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f10322 + ')';
    }
}
