package p000;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: renamed from: ۥؘٞؖۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1960 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5666 f6464;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6465;

    public /* synthetic */ C1960(C5666 c5666, InterfaceC1066 interfaceC1066) {
        this.f6465 = 3;
        this.f6464 = c5666;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f6465;
        boolean z = false;
        C5666 c5666 = this.f6464;
        switch (i) {
            case 0:
                C4852 c4852 = c5666.f18641.f19227;
                Boolean bool = Boolean.TRUE;
                c4852.setValue(bool);
                c5666.f18641.f19222.setValue(bool);
                C5837 c5837 = c5666.f18641;
                AutofillValue autofillValue = ((C1272) obj).f4344;
                C5666.m9490(c5837, (String) (autofillValue.isText() ? autofillValue.getTextValue() : null), c5666.f18639);
                return bool;
            case 1:
                List list = (List) obj;
                if (c5666.f18641.m9648() != null) {
                    list.add(c5666.f18641.m9648().f8158);
                    z = true;
                }
                return Boolean.valueOf(z);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5666.m9490(c5666.f18641, ((C1249) obj).f4307, c5666.f18639);
                return Boolean.TRUE;
            default:
                C1249 c1249 = (C1249) obj;
                if (c5666.f18639) {
                    C2829 c2829 = c5666.f18641.f19223;
                    if (c2829 != null) {
                        List listM4188 = AbstractC2164.m4188(new C4826(), new C1472(c1249, 1));
                        C5837 c5838 = c5666.f18641;
                        C5002 c5002 = c5838.f19234;
                        C5149 c5149 = c5838.f19244;
                        C5745 c5745M8417 = c5002.m8417(listM4188);
                        c2829.m5393(null, c5745M8417);
                        c5149.mo211(c5745M8417);
                    } else {
                        C5745 c5745 = c5666.f18637;
                        String str = c5745.f18944.f4307;
                        long j = c5745.f18943;
                        int i2 = C3346.f11195;
                        String string = AbstractC0684.m1525(str, (int) (j >> 32), (int) (j & 4294967295L), c1249).toString();
                        int length = c1249.f4307.length() + ((int) (c5666.f18637.f18943 >> 32));
                        c5666.f18641.f19244.mo211(new C5745(AbstractC2765.m5145(length, length), string, 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ C1960(C5666 c5666, int i) {
        this.f6465 = i;
        this.f6464 = c5666;
    }
}
