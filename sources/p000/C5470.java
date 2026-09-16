package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؘۡؕ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5470 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C5470 f18033;

    /* JADX INFO: renamed from: ۥؗ */
    public Object f18034;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f18035;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f18036;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f18037;

    static {
        Object obj = null;
        f18033 = new C5470(0, obj, obj, true);
    }

    public C5470(int i) {
        this.f18036 = i;
        switch (i) {
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f18034 = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C5470 m9153() {
        C5470 c5470 = new C5470(3);
        c5470.f18035 = true;
        return c5470;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static C5470 m9154(String str) {
        return new C5470(0, str, null, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static C5470 m9155(String str, Exception exc) {
        return new C5470(0, str, exc, 0 == true ? 1 : 0);
    }

    public String toString() {
        String str;
        switch (this.f18036) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.f18035);
                sb.append(", crossed=");
                int iM9161 = m9161();
                if (iM9161 == 1) {
                    str = "CROSSED";
                } else if (iM9161 != 2) {
                    str = iM9161 != 3 ? "null" : "COLLAPSED";
                } else {
                    str = "NOT_CROSSED";
                }
                sb.append(str);
                sb.append(", info=\n\t");
                sb.append((C4902) this.f18037);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m9156() {
        if (this.f18035) {
            ((C3635) this.f18037).m6486((C3346) this.f18034);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public long m9157(C5745 c5745, long j, boolean z, C0178 c0178) {
        C3635 c3635 = (C3635) this.f18037;
        long jM6487 = c3635.m6487(c5745, j, z, false, c0178, false, null);
        if (!C3346.m6112(jM6487, (C3346) this.f18034)) {
            this.f18035 = false;
        }
        c3635.m6474(C3346.m6107(jM6487) ? EnumC1546.f5229 : EnumC1546.f5231);
        return jM6487;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C5470 m9158() {
        AbstractC0487.m1079("execute parameter required", ((InterfaceC1170) this.f18034) != null);
        return new C5470(this, (C2274[]) this.f18037, this.f18035);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m9159(InterfaceC0110 interfaceC0110) {
        synchronized (this.f18034) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.f18037;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f18037 = arrayDeque;
                }
                arrayDeque.add(interfaceC0110);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public boolean m9160(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((C3369) this.f18037).f11255;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (AbstractC5378.m9062(((C0284) obj).f1055, j)) {
                break;
            }
            i++;
        }
        C0284 c0284 = (C0284) obj;
        if (c0284 != null) {
            return c0284.f1054;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public int m9161() {
        C4902 c4902 = (C4902) this.f18037;
        int i = c4902.f16168;
        int i2 = c4902.f16166;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m9162(C3580 c3580) {
        InterfaceC0110 interfaceC0110;
        synchronized (this.f18034) {
            if (((ArrayDeque) this.f18037) != null && !this.f18035) {
                this.f18035 = true;
                while (true) {
                    synchronized (this.f18034) {
                        try {
                            interfaceC0110 = (InterfaceC0110) ((ArrayDeque) this.f18037).poll();
                            if (interfaceC0110 == null) {
                                this.f18035 = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    interfaceC0110.mo207(c3580);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public String mo2648() {
        return (String) this.f18034;
    }

    public /* synthetic */ C5470(int i, Object obj, Object obj2, boolean z) {
        this.f18036 = i;
        this.f18035 = z;
        this.f18034 = obj;
        this.f18037 = obj2;
    }

    public C5470(C5470 c5470, C2274[] c2274Arr, boolean z) {
        this.f18036 = 5;
        this.f18037 = c5470;
        this.f18034 = c2274Arr;
        boolean z2 = false;
        if (c2274Arr != null && z) {
            z2 = true;
        }
        this.f18035 = z2;
    }

    public C5470(C0638 c0638, C3369 c3369) {
        this.f18036 = 1;
        this.f18034 = c0638;
        this.f18037 = c3369;
    }

    public C5470(C3635 c3635) {
        this.f18036 = 4;
        this.f18037 = c3635;
        this.f18035 = true;
    }
}
