package p000;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥؒؑۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0235 implements InterfaceC1180 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Object f880;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f881;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f882;

    public /* synthetic */ C0235(int i, Object obj, Object obj2) {
        this.f882 = i;
        this.f881 = obj;
        this.f880 = obj2;
    }

    @Override // p000.InterfaceC1180
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo497() {
        int i = this.f882;
        Object obj = this.f880;
        Object obj2 = this.f881;
        switch (i) {
            case 0:
                ((C2069) obj2).f6832.m6501(obj);
                break;
            case 1:
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj2;
                C3656 c3656 = (C3656) interfaceC4367.getValue();
                if (c3656 != null) {
                    C0199 c0199 = new C0199(c3656);
                    C2243 c2243 = (C2243) obj;
                    if (c2243 != null) {
                        c2243.m4291(c0199);
                    }
                    interfaceC4367.setValue(null);
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C0165) obj2).f620.remove((InterfaceC4745) obj);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0777) obj2).f2815.remove((C0777) obj);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C0777 c0777 = (C0777) obj2;
                C5290 c5290 = (C5290) ((C5627) obj).f18553.getValue();
                if (c5290 != null) {
                    c0777.f2816.remove(c5290.f17427);
                }
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C0777) obj2).f2816.remove((C3051) obj);
                break;
            default:
                C2816 c2816 = (C2816) obj2;
                View view = (View) obj;
                int i2 = c2816.f9405 - 1;
                c2816.f9405 = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC3608.f12013;
                    AbstractC5039.m8554(view, null);
                    C0460.m977(view, null);
                    view.removeOnAttachStateChangeListener(c2816.f9413);
                }
                break;
        }
    }
}
