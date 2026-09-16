package p000;

import android.app.ActivityOptions;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewParent;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import de.robv.android.xposed.XSharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥّؕؔؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0463 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f1679;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1680;

    public /* synthetic */ C0463(int i, Object obj) {
        this.f1680 = i;
        this.f1679 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fa A[Catch: all -> 0x01ef, LOOP:4: B:76:0x01ba->B:90:0x01fa, LOOP_END, TryCatch #6 {all -> 0x01ef, blocks: (B:84:0x01e9, B:87:0x01f1, B:92:0x0204, B:90:0x01fa), top: B:151:0x01e9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() throws Throwable {
        Object obj;
        boolean z;
        WorkDatabase workDatabase;
        C2813 c2813;
        boolean zM9449;
        int i = this.f1680;
        int i2 = 2;
        boolean z2 = true;
        int i3 = 0;
        byte b = 0;
        Object obj2 = this.f1679;
        switch (i) {
            case 0:
                InterfaceC3983 interfaceC3983 = (InterfaceC3983) obj2;
                interfaceC3983.mo110().mo2388(new C4654(0, interfaceC3983));
                return C2358.f7817;
            case 1:
                C4830 c4830 = (C4830) obj2;
                C3376 c3376 = (C3376) AbstractC2552.m4807(c4830, AbstractC4834.f15922);
                c4830.f15918 = c3376;
                c4830.f15908 = c3376 != null ? new C2851(c3376.f11263, c3376.f11262, c3376.f11261, c3376.f11264) : null;
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return (ViewParent) obj2;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C2148 c2148 = (C2148) obj2;
                return Integer.valueOf(AbstractC4593.m7967(c2148, c2148.f7051));
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC2765.m5135(AbstractC2776.m5210((C3557) obj2), null, 0, new C4564(2, b == true ? 1 : 0, 4), 3);
                return C2358.f7817;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C3544 c3544 = (C3544) obj2;
                C4852 c4852 = c3544.f11772;
                if (((C3291) c4852.getValue()).f11025 == 9205357640488583168L || C3291.m6051(((C3291) c4852.getValue()).f11025)) {
                    return null;
                }
                C0714 c0714 = c3544.f11775;
                long j = ((C3291) c4852.getValue()).f11025;
                return c0714.f2616;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((C1705) obj2).f5670;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5389 c5389 = (C5389) obj2;
                while (true) {
                    Object obj3 = c5389.f17819;
                    synchronized (obj3) {
                        try {
                            if (c5389.f17810) {
                                obj = obj3;
                            } else {
                                c5389.f17810 = z2;
                                try {
                                    C0863 c0863 = c5389.f17812;
                                    Object[] objArr = c0863.f3182;
                                    int i4 = c0863.f3180;
                                    int i5 = i3;
                                    while (i5 < i4) {
                                        try {
                                            C5471 c5471 = (C5471) objArr[i5];
                                            C3639 c3639 = c5471.f18050;
                                            InterfaceC4745 interfaceC4745 = c5471.f18043;
                                            Object[] objArr2 = c3639.f12174;
                                            long[] jArr = c3639.f12175;
                                            int length = jArr.length - i2;
                                            if (length >= 0) {
                                                int i6 = i3;
                                                while (true) {
                                                    long j2 = jArr[i6];
                                                    obj = obj3;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                        for (int i8 = i3; i8 < i7; i8++) {
                                                            if ((j2 & 255) < 128) {
                                                                try {
                                                                    interfaceC4745.mo211(objArr2[(i6 << 3) + i8]);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    z = 0;
                                                                    c5389.f17810 = z;
                                                                    throw th;
                                                                }
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i7 == 8) {
                                                            if (i6 != length) {
                                                                i6++;
                                                                i3 = 0;
                                                                obj3 = obj;
                                                            }
                                                        }
                                                    } else if (i6 != length) {
                                                        i6++;
                                                        i3 = 0;
                                                        obj3 = obj;
                                                    }
                                                }
                                            } else {
                                                obj = obj3;
                                            }
                                            c3639.m6493();
                                            i5++;
                                            i2 = 2;
                                            i3 = 0;
                                            obj3 = obj;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj = obj3;
                                        }
                                    }
                                    obj = obj3;
                                    try {
                                        c5389.f17810 = i3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj3;
                                    z = i3;
                                }
                            }
                            if (!c5389.m9078()) {
                                return C2358.f7817;
                            }
                            i2 = 2;
                            z2 = true;
                            i3 = 0;
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj3;
                        }
                    }
                }
                break;
            case 8:
                C2640 c2640 = (C2640) obj2;
                c2640.f8773 = null;
                AbstractC0186.m412(c2640);
                C5063.m8642(c2640);
                AbstractC5378.m9047(c2640);
                return Boolean.TRUE;
            case 9:
                PendingIntent actionIntent = ((RemoteAction) obj2).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return C2358.f7817;
            case 10:
                C0625 c0625 = (C0625) obj2;
                return c0625.f17786 ? AbstractC0186.m441(c0625) : C1197.f4125;
            case 11:
                return new C0873(((C4730) obj2).m8055());
            case 12:
                C2210 c2210 = (C2210) obj2;
                c2210.f7318 = null;
                AbstractC0186.m412(c2210);
                C5063.m8642(c2210);
                AbstractC5378.m9047(c2210);
                return Boolean.TRUE;
            case 13:
                C5754 c5754 = (C5754) obj2;
                c5754.f18971.mo211(Boolean.valueOf(!c5754.f18970));
                return C2358.f7817;
            case 14:
                Object systemService = ((Context) ((C5460) obj2).f18001).getSystemService(new C4441(new long[]{3949299924563842840L, 8256172871879609496L, 2848747550693040608L}).toString());
                new C4441(new long[]{-8243075795398224785L, 4801387814151576714L, -7063913696439116068L, 1402196394093471154L, -5401077017965208811L, -8635859896207425784L, 2383653647951135691L, 4627294256541391130L, 1205193891313232240L, 812604309325203329L}).toString();
                return (NotificationManager) systemService;
            case 15:
                C1811 c1811 = (C1811) obj2;
                String str = AbstractC5603.f18455;
                C3600 c3600 = c1811.f6034;
                HashSet hashSet = new HashSet();
                hashSet.addAll(c1811.f6030);
                HashSet hashSetM3591 = C1811.m3591(c1811);
                Iterator it = hashSet.iterator();
                do {
                    if (!it.hasNext()) {
                        hashSet.removeAll(c1811.f6030);
                        z2 = false;
                    }
                    if (!z2) {
                        C5028.m8446(c1811, ")", "WorkContinuation has cycles (");
                        return null;
                    }
                    workDatabase = c3600.f11986;
                    c2813 = c3600.f11989;
                    workDatabase.m91();
                    try {
                        C4773.m8155(workDatabase, c2813, c1811);
                        zM9449 = AbstractC5603.m9449(c1811);
                        workDatabase.m87();
                        workDatabase.m95();
                        if (zM9449) {
                            AbstractC5554.m9308(c2813, c3600.f11986, c3600.f11987);
                        }
                        return C2358.f7817;
                    } catch (Throwable th6) {
                        workDatabase.m95();
                        throw th6;
                    }
                } while (!hashSetM3591.contains((String) it.next()));
                if (!z2) {
                    C5028.m8446(c1811, ")", "WorkContinuation has cycles (");
                    return null;
                }
                workDatabase = c3600.f11986;
                c2813 = c3600.f11989;
                workDatabase.m91();
                C4773.m8155(workDatabase, c2813, c1811);
                zM9449 = AbstractC5603.m9449(c1811);
                workDatabase.m87();
                workDatabase.m95();
                if (zM9449) {
                    AbstractC5554.m9308(c2813, c3600.f11986, c3600.f11987);
                }
                return C2358.f7817;
            case 16:
                C3600 c3601 = (C3600) obj2;
                WorkDatabase workDatabase2 = c3601.f11986;
                Context context = c3601.f11991;
                String str2 = C5886.f19415;
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC1718.m3533(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListM9719 = C5886.m9719(context, jobScheduler);
                if (arrayListM9719 != null && !arrayListM9719.isEmpty()) {
                    Iterator it2 = arrayListM9719.iterator();
                    while (it2.hasNext()) {
                        C5886.m9718(jobScheduler, ((JobInfo) it2.next()).getId());
                    }
                }
                ((Number) AbstractC0487.m1075(workDatabase2.mo103().f663, false, true, new C3875(29))).intValue();
                AbstractC5554.m9308(c3601.f11989, workDatabase2, c3601.f11987);
                return C2358.f7817;
            case 17:
                return ((Worker) obj2).mo82();
            default:
                C4419 c4419 = (C4419) obj2;
                return new XSharedPreferences(c4419.f14571, c4419.f14570);
        }
    }
}
