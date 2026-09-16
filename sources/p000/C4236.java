package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦؘُٕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4236 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2432 f14039;

    /* JADX INFO: renamed from: ۥۣ */
    public final Enum[] f14040;

    public C4236(String str, Enum[] enumArr) {
        this.f14040 = enumArr;
        this.f14039 = new C2432(new C1225(11, this, str));
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + mo193().mo186() + '>';
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return (InterfaceC0103) this.f14039.getValue();
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        int iMo4109 = interfaceC2125.mo4109(mo193());
        Enum[] enumArr = this.f14040;
        if (iMo4109 >= 0 && iMo4109 < enumArr.length) {
            return enumArr[iMo4109];
        }
        throw new C0480(iMo4109 + " is not among valid " + mo193().mo186() + " enum values, values size is " + enumArr.length);
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        Enum r5 = (Enum) obj;
        Enum[] enumArr = this.f14040;
        int iM518 = AbstractC0246.m518(enumArr, r5);
        if (iM518 != -1) {
            c3782.m6686(mo193().mo184(iM518));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strMo186 = mo193().mo186();
        String string = Arrays.toString(enumArr);
        sb.append(" is not a valid enum ");
        sb.append(strMo186);
        sb.append(", must be one of ");
        sb.append(string);
        throw new C0480(sb.toString());
    }
}
