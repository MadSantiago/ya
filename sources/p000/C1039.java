package p000;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: ۥُؒۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1039 implements InterfaceC4895, InterfaceC5641, InterfaceC4205, InterfaceC1511, InterfaceC0260, InterfaceC2023, InterfaceC1170, InterfaceC3744, InterfaceC1463, InterfaceC2342, InterfaceC0130 {

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f3672;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3673;

    public C1039(long[] jArr) {
        C2741 c2741;
        this.f3673 = 10;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c2741 = new C2741(jArrCopyOf.length);
            int i = c2741.f9072;
            if (i < 0) {
                AbstractC2552.m4812("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArrCopyOf2 = c2741.f9073;
                if (jArrCopyOf2.length < length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length, (jArrCopyOf2.length * 3) / 2));
                    c2741.f9073 = jArrCopyOf2;
                }
                int i2 = c2741.f9072;
                if (i != i2) {
                    AbstractC0246.m511(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i, i, i2);
                }
                System.arraycopy(jArrCopyOf, 0, jArrCopyOf2, i, jArrCopyOf.length);
                c2741.f9072 += jArrCopyOf.length;
            }
        } else {
            c2741 = new C2741();
        }
        this.f3672 = c2741;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۦۙ */
    public static java.util.ArrayList m2241(p000.C1039 r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1039.m2241(ۥُؒۚۧ, java.lang.String):java.util.ArrayList");
    }

    @Override // p000.InterfaceC1170
    public void accept(Object obj, Object obj2) {
        C2332 c2332 = (C2332) obj2;
        C3561 c3561 = (C3561) ((C5340) obj).m7333();
        C0307 c0307 = (C0307) this.f3672;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c3561.f14081);
        int i = AbstractC2694.f8937;
        if (c0307 == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            c0307.writeToParcel(parcelObtain, 0);
        }
        try {
            c3561.f14082.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            c2332.f7721.m6395(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        switch (this.f3673) {
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0668(Integer.valueOf(C0668.f2462).intValue(), (Context) ((InterfaceC4895) this.f3672).get(), "com.google.android.datatransport.events");
            default:
                return new C1111((C0909) ((InterfaceC5641) this.f3672).get());
        }
    }

    @Override // p000.InterfaceC2342
    /* JADX INFO: renamed from: ۥؗ */
    public void mo2242() {
        ((CountDownLatch) this.f3672).countDown();
    }

    @Override // p000.InterfaceC1463
    /* JADX INFO: renamed from: ۥُ */
    public void mo2243(Exception exc) {
        ((CountDownLatch) this.f3672).countDown();
    }

    /* JADX INFO: renamed from: ۥّ */
    public C0348 m2244() {
        C1702 c1702M2122;
        C1405 c1405 = (C1405) this.f3672;
        C0992 c0992 = (C0992) c1405.f4838;
        synchronized (c0992) {
            c1405.m2973(true);
            c1702M2122 = c0992.m2122(((C1959) c1405.f4836).f6460);
        }
        if (c1702M2122 != null) {
            return new C0348(c1702M2122);
        }
        return null;
    }

    @Override // p000.InterfaceC2023
    /* JADX INFO: renamed from: ۥۗ */
    public void mo1660(C2612 c2612) {
        ((InterfaceC3785) this.f3672).mo1896(c2612);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public long m2245(long j) {
        C2394 c2394 = (C2394) this.f3672;
        if (C0963.m1998(j) <= 0.0f || C0963.m1995(j) <= 0.0f) {
            AbstractC3480.m6278("maximumVelocity should be a positive value. You specified=" + ((Object) C0963.m2001(j)));
        }
        return AbstractC3933.m7091(((C5426) c2394.f7965).m9101(C0963.m1998(j)), ((C5426) c2394.f7964).m9101(C0963.m1995(j)));
    }

    @Override // p000.InterfaceC3744
    /* JADX INFO: renamed from: ۦؑ */
    public void mo2246(Object obj) {
        ((CountDownLatch) this.f3672).countDown();
    }

    @Override // p000.InterfaceC0130
    /* JADX INFO: renamed from: ۦؚ */
    public boolean mo285(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC0130[]) this.f3672)[i].mo285(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC4205
    /* JADX INFO: renamed from: ۦٛ */
    public Object mo2247(InterfaceC1437 interfaceC1437, Float f, Float f2, InterfaceC4745 interfaceC4745, C5182 c5182) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objM4202 = AbstractC2164.m4202(interfaceC1437, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, AbstractC4554.m7901(0.0f, fFloatValue2, 28), (C0969) this.f3672, interfaceC4745, c5182);
        return objM4202 == EnumC2282.f7590 ? objM4202 : (C3241) objM4202;
    }

    @Override // p000.InterfaceC0130
    /* JADX INFO: renamed from: ۦ۟ */
    public C3730 mo286(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC0130 interfaceC0130 = ((InterfaceC0130[]) this.f3672)[i];
            if (interfaceC0130.mo285(cls)) {
                return interfaceC0130.mo286(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC0260
    public InterfaceC0862 get(int i) {
        switch (this.f3673) {
            case 17:
                return ((C2673[]) this.f3672)[i];
            default:
                return (InterfaceC0862) this.f3672;
        }
    }

    public /* synthetic */ C1039(int i, boolean z) {
        this.f3673 = i;
    }

    public C1039(C4752 c4752, C0488 c0488) {
        this.f3673 = 23;
        this.f3672 = c4752;
    }

    public C1039(AppMeasurementSdk appMeasurementSdk, C5002 c5002) {
        this.f3673 = 29;
        this.f3672 = c5002;
        appMeasurementSdk.m119(new C2057(1, this));
    }

    public C1039(int i) {
        Object c3223;
        this.f3673 = i;
        switch (i) {
            case 19:
                this.f3672 = new C2394();
                break;
            case 26:
                this.f3672 = new CountDownLatch(1);
                break;
            case 28:
                this.f3672 = new C3580();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    c3223 = new C4036(21);
                } else {
                    c3223 = new C3223(21);
                }
                this.f3672 = c3223;
                break;
        }
    }

    public C1039(View view) {
        this.f3673 = 11;
        if (Build.VERSION.SDK_INT >= 30) {
            C1641 c1641 = new C1641(21, view);
            c1641.f5484 = view;
            this.f3672 = c1641;
            return;
        }
        this.f3672 = new C3121(21, view);
    }

    public C1039(C4047 c4047, C4228 c4228) {
        this.f3673 = 22;
        this.f3672 = c4047;
        new LinkedHashSet();
        new LinkedHashMap();
    }

    public /* synthetic */ C1039(int i, Object obj) {
        this.f3673 = i;
        this.f3672 = obj;
    }

    public C1039(float f, float f2, AbstractC1814 abstractC1814) {
        this.f3673 = 17;
        int iMo2173 = abstractC1814.mo2173();
        C2673[] c2673Arr = new C2673[iMo2173];
        for (int i = 0; i < iMo2173; i++) {
            c2673Arr[i] = new C2673(f, f2, abstractC1814.mo2174(i));
        }
        this.f3672 = c2673Arr;
    }

    public C1039(SideSheetBehavior sideSheetBehavior) {
        this.f3673 = 9;
        this.f3672 = sideSheetBehavior;
        new RunnableC0029(19, this);
    }
}
