package p000;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: ۦٕؓٙؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4228 implements InterfaceC0614, InterfaceC3864, InterfaceC5058, InterfaceC3814, InterfaceC4895, InterfaceC4205, InterfaceC3550 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C5587 f14022;

    /* JADX INFO: renamed from: ۥْ */
    public static volatile C4228 f14023;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C4228 f14024;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f14025;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14026;

    static {
        int i = 1;
        f14024 = new C4228(i, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        f14022 = new C5587(i);
    }

    public C4228(int i) {
        InterfaceC5743 interfaceC5743;
        this.f14026 = i;
        switch (i) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5734 c5734 = C5734.f18904;
                try {
                    interfaceC5743 = (InterfaceC5743) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC5743 = f14022;
                }
                InterfaceC5743[] interfaceC5743Arr = {C5587.f18421, interfaceC5743};
                C3691 c3691 = new C3691();
                c3691.f12322 = interfaceC5743Arr;
                Charset charset = AbstractC3576.f11899;
                this.f14025 = c3691;
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                this.f14025 = new C3425(this);
                break;
            case 8:
                this.f14025 = new C0863(new C2769[16]);
                break;
            case 9:
                this.f14025 = new C1039(28);
                break;
            case 12:
                this.f14025 = new C0615(C2680.f8890);
                break;
            case 18:
                this.f14025 = AbstractC4554.m7893(Looper.getMainLooper());
                break;
            case 20:
                this.f14025 = new ConcurrentHashMap(16);
                break;
            case 27:
                this.f14025 = null;
                break;
            default:
                this.f14025 = new HashSet();
                break;
        }
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        switch (this.f14026) {
            case 16:
                return new C2808((Context) ((C0334) this.f14025).f1250, new C4575(4), new C4369(3), 8);
            default:
                String packageName = ((Context) ((InterfaceC4895) this.f14025).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                C0178.m387("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }

    public String toString() {
        switch (this.f14026) {
            case 1:
                return "Bradford";
            case 13:
                return "ContentInfoCompat{" + ((ContentInfo) this.f14025) + "}";
            case 28:
                return "[class] placeholder_hook_class [throwable] " + ((Throwable) this.f14025) + " [instance] null";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC5058
    /* JADX INFO: renamed from: ۥؗ */
    public int mo838() {
        return ((ContentInfo) this.f14025).getFlags();
    }

    /* JADX INFO: renamed from: ۥَ */
    public C5817 mo1743(int i) {
        return null;
    }

    @Override // p000.InterfaceC5058
    /* JADX INFO: renamed from: ۥُ */
    public ContentInfo mo839() {
        return (ContentInfo) this.f14025;
    }

    @Override // p000.InterfaceC3864
    /* JADX INFO: renamed from: ۥّ */
    public void mo6897(MenuC4903 menuC4903, MenuItem menuItem) {
        ((ViewOnKeyListenerC5614) this.f14025).f18482.removeCallbacksAndMessages(menuC4903);
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m7494(float f) {
        ((Parcel) this.f14025).writeFloat(f);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m7495(long j) {
        long jM8439 = C5023.m8439(j);
        byte b = 0;
        if (!C3970.m7128(jM8439, 0L)) {
            if (C3970.m7128(jM8439, 4294967296L)) {
                b = 1;
            } else if (C3970.m7128(jM8439, 8589934592L)) {
                b = 2;
            }
        }
        m7501(b);
        if (C3970.m7128(C5023.m8439(j), 0L)) {
            return;
        }
        m7494(C5023.m8438(j));
    }

    /* JADX INFO: renamed from: ۥٖ */
    public StringBuilder m7496() {
        AbstractC0027 abstractC0027 = (AbstractC0027) this.f14025;
        if (!(abstractC0027 instanceof C3296)) {
            return null;
        }
        StringBuilder sb = ((C3296) abstractC0027).f11035.f14976;
        if (sb.length() == 0) {
            return null;
        }
        return sb;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public boolean mo1744(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // p000.InterfaceC3550
    /* JADX INFO: renamed from: ۥۗ */
    public void mo6352(Object obj) {
        C2233 c2233 = (C2233) obj;
        C2790 c2790 = (C2790) this.f14025;
        C5351 c5351 = (C5351) c2790.f9311.pollLast();
        if (c5351 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = c5351.f17619;
        int i = c5351.f17618;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M3117 = c2790.f9298.m3117(str);
        if (abstractComponentCallbacksC0308M3117 != null) {
            abstractComponentCallbacksC0308M3117.m663(i, c2233.f7400, c2233.f7399);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // p000.InterfaceC5058
    /* JADX INFO: renamed from: ۥۜ */
    public int mo841() {
        return ((ContentInfo) this.f14025).getSource();
    }

    @Override // p000.InterfaceC5058
    /* JADX INFO: renamed from: ۥۣ */
    public ClipData mo842() {
        return ((ContentInfo) this.f14025).getClip();
    }

    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦؑ */
    public boolean mo1377(MenuC4903 menuC4903, MenuItem menuItem) {
        InterfaceC1511 interfaceC1511 = ((ActionMenuView) this.f14025).f102;
        if (interfaceC1511 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((C1039) interfaceC1511).f3672).f136.f9376).iterator();
        while (it.hasNext()) {
            if (((C2050) it.next()).f6760.m5312()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC3814
    /* JADX INFO: renamed from: ۦؚ */
    public C3580 mo4409(Object obj) {
        C5040 c5040 = (C5040) obj;
        C5002 c5002 = (C5002) this.f14025;
        if (c5040 == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return AbstractC5378.m9075(null);
        }
        C4743 c4743 = (C4743) c5002.f16550;
        C5680 c5680 = C4743.f15653;
        c4743.m8070();
        c4743.f15663.m6368(null, (ExecutorC2291) c4743.f15655.f9378);
        c4743.f15657.m4374(null);
        return AbstractC5378.m9075(null);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m7497(CancellationException cancellationException) {
        C0863 c0863 = (C0863) this.f14025;
        int i = c0863.f3180;
        InterfaceC4242[] interfaceC4242Arr = new InterfaceC4242[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4242Arr[i2] = ((C2769) c0863.f3182[i2]).f9187;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC4242Arr[i3].mo3713(cancellationException);
        }
        if (c0863.f3180 == 0) {
            return;
        }
        AbstractC4690.m8035("uncancelled requests present");
    }

    @Override // p000.InterfaceC3864
    /* JADX INFO: renamed from: ۦِ */
    public void mo6898(MenuC4903 menuC4903, C1092 c1092) {
        ViewOnKeyListenerC5614 viewOnKeyListenerC5614 = (ViewOnKeyListenerC5614) this.f14025;
        Handler handler = viewOnKeyListenerC5614.f18482;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC5614.f18496;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC4903 == ((C5298) arrayList.get(i)).f17449) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC1948(this, i2 < arrayList.size() ? (C5298) arrayList.get(i2) : null, c1092, menuC4903, 0), menuC4903, SystemClock.uptimeMillis() + 200);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void m7498() {
        C0863 c0863 = (C0863) this.f14025;
        C3046 c3046M7917 = AbstractC4554.m7917(0, c0863.f3180);
        int i = c3046M7917.f6006;
        int i2 = c3046M7917.f6005;
        if (i <= i2) {
            while (true) {
                ((C2769) c0863.f3182[i]).f9187.mo335(C2358.f7817);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c0863.m1851();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void m7499() {
        ((C0827) this.f14025).f2925.m5278();
    }

    @Override // p000.InterfaceC4205
    /* JADX INFO: renamed from: ۦٛ */
    public Object mo2247(InterfaceC1437 interfaceC1437, Float f, Float f2, InterfaceC4745 interfaceC4745, C5182 c5182) {
        Object objM4210 = AbstractC2164.m4210(interfaceC1437, f.floatValue(), AbstractC4554.m7901(0.0f, f2.floatValue(), 28), (C5468) this.f14025, interfaceC4745, c5182);
        return objM4210 == EnumC2282.f7590 ? objM4210 : (C3241) objM4210;
    }

    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦۙ */
    public void mo1378(MenuC4903 menuC4903) {
        C3121 c3121 = ((ActionMenuView) this.f14025).f95;
        if (c3121 != null) {
            c3121.mo1378(menuC4903);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public C5817 mo1746(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public void m7500(C5534 c5534, Thread thread, Throwable th) {
        C4743 c4743 = (C4743) this.f14025;
        synchronized (c4743) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            AbstractC0186.m423();
            try {
                AbstractC1242.m2630(((ExecutorC2291) c4743.f15655.f9378).m4345(new CallableC2838(c4743, System.currentTimeMillis(), th, thread, c5534)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m7501(byte b) {
        ((Parcel) this.f14025).writeByte(b);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m7502() {
        ((AbstractC2109) this.f14025).getClass();
    }

    public /* synthetic */ C4228(int i, boolean z) {
        this.f14026 = i;
    }

    public /* synthetic */ C4228(int i, Object obj) {
        this.f14026 = i;
        this.f14025 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029 A[PHI: r10
  0x0029: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0019, B:10:0x0022, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    public C4228(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.f14026 = 6;
        int i2 = 1;
        int length = fArr.length - 1;
        C1662[][] c1662Arr = new C1662[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != i2) {
                            i3 = i2;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C1662[] c1662Arr2 = new C1662[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                c1662Arr2[i11] = new C1662(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            c1662Arr[i5] = c1662Arr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.f14025 = c1662Arr;
    }

    public C4228(TextView textView) {
        this.f14026 = 22;
        this.f14025 = new C5248(textView);
    }

    public C4228(ContentInfo contentInfo) {
        this.f14026 = 13;
        contentInfo.getClass();
        this.f14025 = AbstractC4759.m8105(contentInfo);
    }

    public C4228(BottomSheetBehavior bottomSheetBehavior) {
        this.f14026 = 7;
        this.f14025 = bottomSheetBehavior;
        new RunnableC3365(3, this);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void mo1745(int i, C5817 c5817, String str, Bundle bundle) {
    }
}
