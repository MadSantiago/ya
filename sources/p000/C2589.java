package p000;

/* JADX INFO: renamed from: ۥؘۡٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2589 extends AbstractC2619 implements InterfaceC3602 {

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f8646;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2589(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f8646 = i2;
    }

    @Override // p000.InterfaceC3602
    public final Object get() {
        int i = this.f8646;
        Object obj = this.f11309;
        switch (i) {
            case 0:
                return ((InterfaceC5372) obj).getValue();
            case 1:
                return ((InterfaceC5372) obj).getValue();
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return obj.getClass().getSimpleName();
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((InterfaceC5372) obj).getValue();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((InterfaceC5372) obj).getValue();
            default:
                return ((InterfaceC5372) obj).getValue();
        }
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        return get();
    }

    @Override // p000.AbstractC3398
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC1620 mo486() {
        AbstractC5041.f16726.getClass();
        return this;
    }
}
