package p000;

/* JADX INFO: renamed from: ۥؓۥؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0364 implements InterfaceC3552 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f1319;

    public C0364(int i) {
        this.f1319 = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC3552.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC3552)) {
            return false;
        }
        InterfaceC3552 interfaceC3552 = (InterfaceC3552) obj;
        return this.f1319 == interfaceC3552.tag() && EnumC2221.f7357.equals(interfaceC3552.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f1319 ^ 14552422) + (EnumC2221.f7357.hashCode() ^ 2041407134);
    }

    @Override // p000.InterfaceC3552
    public final EnumC2221 intEncoding() {
        return EnumC2221.f7357;
    }

    @Override // p000.InterfaceC3552
    public final int tag() {
        return this.f1319;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f1319 + "intEncoding=" + EnumC2221.f7357 + ')';
    }
}
