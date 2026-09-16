package p000;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦ۠ؖ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5413 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f17867;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f17868;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17869;

    public RunnableC5413(C5695 c5695, C0932 c0932) {
        this.f17869 = 3;
        this.f17868 = c0932;
        Objects.requireNonNull(c5695);
        this.f17867 = c5695;
    }

    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0146 A[Catch: CancellationException -> 0x0129, ExecutionException -> 0x012d, TryCatch #12 {CancellationException -> 0x0129, ExecutionException -> 0x012d, blocks: (B:60:0x010e, B:62:0x0124, B:75:0x0138, B:77:0x0146, B:79:0x0152, B:85:0x0163, B:87:0x0167, B:69:0x012f, B:90:0x019e), top: B:188:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0152 A[Catch: CancellationException -> 0x0129, ExecutionException -> 0x012d, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x0129, ExecutionException -> 0x012d, blocks: (B:60:0x010e, B:62:0x0124, B:75:0x0138, B:77:0x0146, B:79:0x0152, B:85:0x0163, B:87:0x0167, B:69:0x012f, B:90:0x019e), top: B:188:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        C4752 c4752;
        InterfaceC2735 interfaceC2735;
        int i = 0;
        switch (this.f17869) {
            case 0:
                C5235 c5235 = (C5235) this.f17868;
                c5235.mo6517();
                if (Build.VERSION.SDK_INT < 30) {
                    return;
                }
                List<C4012> list = (List) this.f17867;
                C4474 c4474 = ((C5371) c5235.f18660).f17713;
                C5371.m9021(c4474);
                SparseArray sparseArrayM7753 = c4474.m7753();
                for (C4012 c4012 : list) {
                    int i2 = c4012.f13377;
                    if (!sparseArrayM7753.contains(i2) || ((Long) sparseArrayM7753.get(i2)).longValue() < c4012.f13378) {
                        c5235.m8885().add(c4012);
                    }
                }
                c5235.m8868();
                return;
            case 1:
                C5371 c5371 = (C5371) ((C5235) this.f17868).f18660;
                C1968 c1968M9029 = c5371.m9029();
                String str = (String) this.f17867;
                String str2 = c1968M9029.f6513;
                if (str2 != null && !str2.equals(str)) {
                    i = 1;
                }
                c1968M9029.f6513 = str;
                if (i != 0) {
                    c5371.m9029().m3857();
                    return;
                }
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C3517 c3517 = (C3517) this.f17867;
                synchronized (c3517.f11644) {
                    ((InterfaceC3744) c3517.f11645).mo2246(((C3580) this.f17868).m6388());
                    break;
                }
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5695 c5695 = (C5695) this.f17867;
                InterfaceC5253 interfaceC5253 = c5695.f18733;
                C5371 c5372 = (C5371) c5695.f18660;
                if (interfaceC5253 == null) {
                    C3610 c3610 = c5372.f17717;
                    C5371.m9020(c3610);
                    c3610.f12020.m9432("Failed to send current screen to service");
                    return;
                }
                try {
                    C0932 c0932 = (C0932) this.f17868;
                    if (c0932 == null) {
                        interfaceC5253.mo6903(0L, null, null, c5372.f17739.getPackageName());
                    } else {
                        interfaceC5253.mo6903(c0932.f3316, c0932.f3320, c0932.f3319, c5372.f17739.getPackageName());
                    }
                    c5695.m9520();
                    return;
                } catch (RemoteException e) {
                    C3610 c3611 = ((C5371) c5695.f18660).f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9430(e, "Failed to send current screen to the service");
                    return;
                }
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((ServiceConnectionC0769) this.f17867).f2785.m9514((ComponentName) this.f17868);
                return;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5695 c5696 = ((ServiceConnectionC0769) this.f17867).f2785;
                c5696.f18733 = null;
                if (((C2612) this.f17868).f8713 != 7777) {
                    c5696.m9512();
                    return;
                }
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = c5696.f18737;
                if (scheduledExecutorServiceNewScheduledThreadPool == null) {
                    scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                    c5696.f18737 = scheduledExecutorServiceNewScheduledThreadPool;
                }
                scheduledExecutorServiceNewScheduledThreadPool.schedule(new RunnableC3365(21, this), ((Long) AbstractC4936.f16301.m4592(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C5034 c5034 = (C5034) this.f17868;
                c5034.m8494();
                Runnable runnable = (Runnable) this.f17867;
                c5034.mo2406().mo6517();
                ArrayList arrayList = c5034.f16693;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    c5034.f16693 = arrayList;
                }
                arrayList.add(runnable);
                c5034.m8498();
                return;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C2391 c2391 = (C2391) this.f17868;
                JobParameters jobParameters = (JobParameters) this.f17867;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((InterfaceC3258) ((Service) c2391.f7924)).mo114(jobParameters);
                return;
            case 8:
                C3517 c3518 = (C3517) this.f17867;
                C3580 c3580 = (C3580) c3518.f11645;
                try {
                    C3580 c3580Mo4409 = ((InterfaceC3814) c3518.f11644).mo4409(((C3580) this.f17868).m6388());
                    ExecutorC3678 executorC3678 = AbstractC4007.f13359;
                    c3580Mo4409.m6389(executorC3678, c3518);
                    c3580Mo4409.m6391(executorC3678, c3518);
                    c3580Mo4409.f11911.m9159(new C3517((Executor) executorC3678, (InterfaceC2342) c3518));
                    c3580Mo4409.m6400();
                    return;
                } catch (CancellationException unused) {
                    c3518.mo2242();
                    return;
                } catch (C3441 e2) {
                    if (e2.getCause() instanceof Exception) {
                        c3518.mo2243((Exception) e2.getCause());
                        return;
                    } else {
                        c3580.m6393(e2);
                        return;
                    }
                } catch (Exception e3) {
                    c3580.m6393(e3);
                    return;
                }
            case 9:
                C3001 c3001 = (C3001) this.f17868;
                try {
                    C0268 c0268 = (C0268) AbstractC2552.m4816((C0081) this.f17867);
                    C4752 c4753 = new C4752(c0268, new C2268(6, 2, 6));
                    boolean z = c3001.f10099;
                    if (z || (c4752 = c3001.f10098) == null) {
                        synchronized (c3001) {
                            if (!z) {
                                c4752 = c3001.f10098;
                                if (c4752 != null) {
                                    if (!((C5147) c4752.f15688).equals((C5147) c4753.f15688)) {
                                        interfaceC2735 = (InterfaceC2735) c3001.f10097.f3559.get();
                                        if (interfaceC2735 != null) {
                                            interfaceC2735.mo3893();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            c3001.f10098 = c4753;
                            c3001.f10096.f1284.incrementAndGet();
                        }
                    } else if (!((C5147) c4752.f15688).equals((C5147) c4753.f15688)) {
                        interfaceC2735 = (InterfaceC2735) c3001.f10097.f3559.get();
                        if (interfaceC2735 != null) {
                            interfaceC2735.mo3893();
                            return;
                        }
                        return;
                    }
                    if (c3001.f10099) {
                        C0996 c0996 = c3001.f10097;
                        C2022 c2022 = (C2022) c0996.f3564.get();
                        String strM555 = c0268.m555();
                        c2022.getClass();
                        strM555.getClass();
                        C0008 c0008M3941 = C2022.m3941(c2022.f6662.m3293(strM555));
                        C0347 c0347 = new C0347(i, c3001);
                        ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499M2177 = c0996.m2177();
                        C0005 c0005 = new C0005(c0008M3941, Throwable.class, c0347);
                        c0008M3941.mo3760(c0005, AbstractC0993.m2137(scheduledExecutorServiceC3499M2177, c0005));
                        return;
                    }
                    return;
                } catch (CancellationException e4) {
                    e = e4;
                    th = e;
                    if (th.getCause() instanceof SecurityException) {
                        return;
                    }
                    String str3 = c3001.f10094;
                    Log.w("FlagStore", AbstractC3761.m6622(new StringBuilder(String.valueOf(str3).length() + 64), "Unable to update local snapshot for ", str3, ", may result in stale flags."), th);
                    return;
                } catch (ExecutionException e5) {
                    e = e5;
                    th = e;
                    if (th.getCause() instanceof SecurityException) {
                        String str4 = c3001.f10094;
                        Log.w("FlagStore", AbstractC3761.m6622(new StringBuilder(String.valueOf(str4).length() + 64), "Unable to update local snapshot for ", str4, ", may result in stale flags."), th);
                        return;
                    }
                    return;
                }
            case 10:
                Context context = ((C0996) this.f17868).f3561;
                C5147 c5147M6295 = C5536.f18278;
                if (c5147M6295 == null) {
                    synchronized (C5536.f18277) {
                        c5147M6295 = C5536.f18278;
                        if (c5147M6295 == null) {
                            C3510 c3510 = new C3510(4);
                            try {
                                String[] list2 = context.getAssets().list("phenotype");
                                if (list2 != null) {
                                    int length = list2.length;
                                    while (i < length) {
                                        String str5 = list2[i];
                                        if (str5.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb = new StringBuilder(str5.length() + 10);
                                                sb.append("phenotype/");
                                                sb.append(str5);
                                                InputStream inputStreamOpen = assets.open(sb.toString());
                                                try {
                                                    C2955 c2955 = C2955.f9912;
                                                    int i3 = AbstractC5529.f18251;
                                                    C5536 c5536 = new C5536(context, C1095.m2315(inputStreamOpen, C2955.f9911));
                                                    c3510.m6302(c5536.f18279, c5536);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (Throwable th2) {
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                        }
                                                        break;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (C5463 e6) {
                                                StringBuilder sb2 = new StringBuilder(str5.length() + 45);
                                                sb2.append("Unable to read Phenotype PackageMetadata for ");
                                                sb2.append(str5);
                                                Log.e("PackageInfo", sb2.toString(), e6);
                                            }
                                        }
                                        i++;
                                    }
                                }
                            } catch (IOException e7) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e7);
                            }
                            c5147M6295 = c3510.m6295(true);
                            C5536.f18278 = c5147M6295;
                        }
                        break;
                    }
                }
                String str6 = (String) this.f17867;
                if (c5147M6295.containsKey(str6)) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(str6.length() + 173);
                sb3.append("Config package ");
                sb3.append(str6);
                sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb3.toString());
                return;
            default:
                C3580 c3581 = (C3580) this.f17868;
                try {
                    c3581.m6395(((Callable) this.f17867).call());
                    return;
                } catch (Exception e8) {
                    c3581.m6393(e8);
                    return;
                } catch (Throwable th4) {
                    c3581.m6393(new RuntimeException(th4));
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC5413(int i, Object obj, Object obj2, boolean z) {
        this.f17869 = i;
        this.f17868 = obj2;
        this.f17867 = obj;
    }

    public RunnableC5413(C2391 c2391, C5034 c5034, Runnable runnable) {
        this.f17869 = 6;
        this.f17868 = c5034;
        this.f17867 = runnable;
    }

    public /* synthetic */ RunnableC5413(int i, Object obj, Object obj2) {
        this.f17869 = i;
        this.f17868 = obj;
        this.f17867 = obj2;
    }
}
