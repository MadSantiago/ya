package p000;

/* JADX INFO: renamed from: ۦؔؖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3232 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object[] f10854;

    /* JADX INFO: renamed from: ۥۣ */
    public static final float[] f10856 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: ۥۗ */
    public static volatile C1870 f10855 = new C1870(0);

    static {
        Object[] objArr = new Object[0];
        f10854 = objArr;
        synchronized (objArr) {
            f10855.m3722(115, new C0944(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f10855.m3722(130, new C0944(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f10855.m3722(150, new C0944(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f10855.m3722(180, new C0944(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f10855.m3722(200, new C0944(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f10855.f6217[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC1236.m2608("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m5955(float f, C0944 c0944) {
        synchronized (f10854) {
            C1870 c1870M3723 = f10855.clone();
            c1870M3723.m3722((int) (f * 100.0f), c0944);
            f10855 = c1870M3723;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static InterfaceC4770 m5956(float f) {
        float f2;
        InterfaceC4770 c0944;
        float[] fArr = f10856;
        if (f < 1.03f) {
            return null;
        }
        C1870 c1870 = f10855;
        int i = (int) (f * 100.0f);
        c1870.getClass();
        InterfaceC4770 interfaceC4770 = (InterfaceC4770) AbstractC5378.m9050(c1870, i);
        if (interfaceC4770 != null) {
            return interfaceC4770;
        }
        C1870 c1871 = f10855;
        int iM4217 = AbstractC2164.m4217(c1871.f6215, i, c1871.f6217);
        if (iM4217 >= 0) {
            return (InterfaceC4770) f10855.m3724(iM4217);
        }
        int i2 = -(iM4217 + 1);
        int i3 = i2 - 1;
        if (i2 >= f10855.f6215) {
            C0944 c0945 = new C0944(new float[]{1.0f}, new float[]{f});
            m5955(f, c0945);
            return c0945;
        }
        if (i3 < 0) {
            c0944 = new C0944(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = f10855.f6217[i3] / 100.0f;
            c0944 = (InterfaceC4770) f10855.m3724(i3);
        }
        float f3 = f10855.f6217[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        InterfaceC4770 interfaceC4771 = (InterfaceC4770) f10855.m3724(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fMo1918 = c0944.mo1918(f4);
            fArr2[i4] = ((interfaceC4771.mo1918(f4) - fMo1918) * fMax) + fMo1918;
        }
        C0944 c0946 = new C0944(fArr, fArr2);
        m5955(f, c0946);
        return c0946;
    }
}
