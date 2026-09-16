package p000;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ۦۗ٘۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4992 implements InterfaceC1133, InterfaceC3463, InterfaceC4895, InterfaceC3562, InterfaceC1804, InterfaceC3128, InterfaceC1930, InterfaceC5241, InterfaceC4708 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16522;

    public /* synthetic */ C4992(int i) {
        this.f16522 = i;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static String m8378(AbstractC0072 abstractC0072) {
        String str = (String) abstractC0072.f13680;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) abstractC0072.mo968().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static C5051 m8379(File file) {
        String str = C5051.f16766;
        String string = file.toString();
        C1007 c1007 = AbstractC0088.f16843;
        C1270 c1270 = new C1270();
        c1270.m2677(string);
        return AbstractC0088.m8667(c1270, false);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static int m8380(C5163 c5163, float f) {
        boolean zEquals = "em".equals(c5163.f17097);
        float f2 = c5163.f17098;
        if (zEquals) {
            f2 *= f;
        }
        return (int) (f2 + 0.5f);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static C5051 m8381(String str) {
        C1007 c1007 = AbstractC0088.f16843;
        C1270 c1270 = new C1270();
        c1270.m2677(str);
        return AbstractC0088.m8667(c1270, false);
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        return new ExecutorC0170(1, Executors.newSingleThreadExecutor());
    }

    public String toString() {
        switch (this.f16522) {
            case 28:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1133
    /* JADX INFO: renamed from: ۥؗ */
    public long mo2390(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = AbstractC2579.f8620;
            return jFloatToRawIntBits;
        }
        float fM5129 = AbstractC2765.m5129(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM5129)) << 32) | (((long) Float.floatToRawIntBits(fM5129)) & 4294967295L);
        int i2 = AbstractC2579.f8620;
        return jFloatToRawIntBits2;
    }

    /* JADX INFO: renamed from: ۥَ */
    public boolean mo8217(Method method) {
        return false;
    }

    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۥُ */
    public int mo5027() {
        return 8;
    }

    @Override // p000.InterfaceC1804
    /* JADX INFO: renamed from: ۥّ */
    public String mo3587() {
        return null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public void mo8382(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public Object mo8218(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public List m8383(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C5221 c5221 : componentRegistrar.getComponents()) {
            String str = c5221.f17240;
            if (str != null) {
                c5221 = new C5221(str, c5221.f17239, c5221.f17236, c5221.f17241, c5221.f17237, new C5017(0, str, c5221), c5221.f17242);
            }
            arrayList.add(c5221);
        }
        return arrayList;
    }

    @Override // p000.InterfaceC3463
    /* JADX INFO: renamed from: ۥۜ */
    public boolean mo5347() {
        return true;
    }

    @Override // p000.InterfaceC3562
    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC2488 mo6355(C3619 c3619) {
        return new C1684(c3619.f12063, c3619.f12062, c3619.f12060, c3619.f12064, c3619.f12061);
    }

    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦؑ */
    public boolean mo5028(AbstractC5381 abstractC5381) {
        return false;
    }

    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦؚ */
    public boolean mo5029(C0605 c0605) {
        C2542 c2542M1331 = c0605.m1331();
        boolean z = false;
        if (c2542M1331 != null && c2542M1331.f8488) {
            z = true;
        }
        return !z;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public String mo8219(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦِ */
    public boolean mo5030(C0679 c0679, C0605 c0605) {
        return false;
    }

    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦٛ */
    public void mo5031(C0605 c0605, long j, C0679 c0679, int i, boolean z) {
        C2457 c2457 = c0605.f2256;
        AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201;
        C1117 c1117 = AbstractC1311.f4507;
        ((AbstractC1311) c2457.f8201).m9776(AbstractC1311.f4508, abstractC1311.m2776(j), c0679, 1, z);
    }

    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦۙ */
    public boolean mo5755(AbstractC5381 abstractC5381) {
        return AbstractC2776.m5218(AbstractC1434.m3032(AbstractC5537.m9270(abstractC5381), false));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r3 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r2.f6447 = r9;
        r2.f6446 = r10;
        r2.f6450 = 1;
        r0 = p000.AbstractC2765.m5130(r10, r2);
        r3 = p000.EnumC2282.f7590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r0 == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0071). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۦ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m8384(java.io.FileOutputStream r10, p000.AbstractC0772 r11) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p000.C1952
            if (r0 == 0) goto L13
            r0 = r11
            ۥؘٞؕؕ r0 = (p000.C1952) r0
            int r1 = r0.f6450
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6450 = r1
            goto L18
        L13:
            ۥؘٞؕؕ r0 = new ۥؘٞؕؕ
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r9 = r0.f6448
            int r11 = r0.f6450
            r1 = 1
            if (r11 == 0) goto L32
            if (r11 != r1) goto L2b
            long r10 = r0.f6446
            java.io.FileOutputStream r2 = r0.f6447
            p000.AbstractC0186.m409(r9)
            r9 = r2
            r2 = r0
            goto L71
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r9)
            r9 = 0
            return r9
        L32:
            p000.AbstractC0186.m409(r9)
            r2 = 10
            r9 = r10
            r10 = r2
            r2 = r0
        L3a:
            r3 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 > 0) goto L76
            java.nio.channels.FileChannel r3 = r9.getChannel()     // Catch: java.io.IOException -> L52
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            r4 = 0
            java.nio.channels.FileLock r9 = r3.lock(r4, r6, r8)     // Catch: java.io.IOException -> L52
            return r9
        L52:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L75
            java.lang.String r4 = "Resource deadlock would occur"
            r5 = 0
            boolean r3 = p000.AbstractC0684.m1527(r3, r4, r5)
            if (r3 != r1) goto L75
            r2.f6447 = r9
            r2.f6446 = r10
            r2.f6450 = r1
            java.lang.Object r0 = p000.AbstractC2765.m5130(r10, r2)
            ۥٟۚؕۨ r3 = p000.EnumC2282.f7590
            if (r0 != r3) goto L71
            return r3
        L71:
            r3 = 2
            long r10 = r10 * r3
            goto L3a
        L75:
            throw r0
        L76:
            java.nio.channels.FileChannel r3 = r9.getChannel()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            r4 = 0
            java.nio.channels.FileLock r9 = r3.lock(r4, r6, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4992.m8384(java.io.FileOutputStream, ۥؚؒۥؔ):java.lang.Object");
    }

    @Override // p000.InterfaceC3463
    public void shutdown() {
    }

    @Override // p000.InterfaceC1804
    /* JADX INFO: renamed from: ۥۗ */
    public void mo3588() {
    }

    @Override // p000.InterfaceC1804
    /* JADX INFO: renamed from: ۦۗ */
    public void mo3589(long j, String str) {
    }

    /* JADX INFO: renamed from: ۥۖ */
    public void mo3073(C2453 c2453, int i, int i2) {
    }

    @Override // p000.InterfaceC4708
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p000.InterfaceC4708
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
