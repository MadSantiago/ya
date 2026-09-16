package p000;

/* JADX INFO: renamed from: ۥًٗؔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1527 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5130 f5172 = AbstractC3933.m7095(2, new C0101(25, this));

    /* JADX INFO: renamed from: ۥۣ */
    public final C3131 f5173;

    public C1527(C3131 c3131) {
        this.f5173 = c3131;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f5173 + ')';
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return (InterfaceC0103) this.f5172.getValue();
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        InterfaceC5308 interfaceC5308Mo4114 = interfaceC2125.mo4114(mo193());
        String strMo5167 = null;
        while (true) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(mo193());
            if (iMo6291 == -1) {
                throw new IllegalArgumentException(AbstractC3761.m6628("Polymorphic value has not been read for class ", strMo5167).toString());
            }
            if (iMo6291 != 0) {
                if (iMo6291 == 1) {
                    if (strMo5167 == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    AbstractC0186.m436(this, interfaceC5308Mo4114, strMo5167);
                    throw null;
                }
                StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                if (strMo5167 == null) {
                    strMo5167 = "unknown class";
                }
                sb.append(strMo5167);
                sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                sb.append(iMo6291);
                throw new C0480(sb.toString());
            }
            strMo5167 = interfaceC5308Mo4114.mo5167(mo193(), iMo6291);
        }
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        AbstractC0186.m442(this, c3782, obj);
        throw null;
    }
}
