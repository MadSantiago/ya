package p000;

/* JADX INFO: renamed from: ۥۘؗؐؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2180 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f7206;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f7207;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2180(int i, int i2) {
        super(1);
        this.f7207 = i2;
        this.f7206 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f7207;
        int i2 = this.f7206;
        switch (i) {
            case 0:
                return Boolean.valueOf(((C3468) obj).m6255(i2));
            case 1:
                return Boolean.valueOf(((C3468) obj).m6255(i2));
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.valueOf(((C3468) obj).m6255(i2));
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(((C3468) obj).m6255(i2));
            default:
                return Boolean.valueOf(((C3468) obj).m6249(i2));
        }
    }
}
