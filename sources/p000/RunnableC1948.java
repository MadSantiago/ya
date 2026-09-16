package p000;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۥٞؔۤٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1948 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f6438;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f6439;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f6440;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f6441;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6442;

    public RunnableC1948(C5235 c5235, AtomicReference atomicReference, String str, String str2) {
        this.f6442 = 5;
        this.f6441 = atomicReference;
        this.f6439 = str;
        this.f6440 = str2;
        Objects.requireNonNull(c5235);
        this.f6438 = c5235;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0435  */
    /* JADX WARN: Code duplicated, block: B:127:0x044a A[LOOP:1: B:125:0x0444->B:127:0x044a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x049a A[Catch: ۦۡؔۚؑ -> 0x0503, LOOP:2: B:130:0x0490->B:132:0x049a, LOOP_END, TryCatch #11 {ۦۡؔۚؑ -> 0x0503, blocks: (B:129:0x0483, B:130:0x0490, B:132:0x049a, B:133:0x04d0, B:135:0x04eb), top: B:172:0x0483 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x04eb A[Catch: ۦۡؔۚؑ -> 0x0503, TRY_LEAVE, TryCatch #11 {ۦۡؔۚؑ -> 0x0503, blocks: (B:129:0x0483, B:130:0x0490, B:132:0x049a, B:133:0x04d0, B:135:0x04eb), top: B:172:0x0483 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        C5571 c5571;
        C0231 c0231;
        int i;
        long jElapsedRealtime;
        byte[] bArrMo6905 = null;
        switch (this.f6442) {
            case 0:
                ViewOnKeyListenerC5614 viewOnKeyListenerC5614 = (ViewOnKeyListenerC5614) ((C4228) this.f6438).f14025;
                C1092 c1092 = (C1092) this.f6439;
                C5298 c5298 = (C5298) this.f6441;
                if (c5298 != null) {
                    viewOnKeyListenerC5614.f18497 = true;
                    c5298.f17449.m8297(false);
                    viewOnKeyListenerC5614.f18497 = false;
                }
                if (c1092.isEnabled() && c1092.hasSubMenu()) {
                    ((MenuC4903) this.f6440).m8299(c1092, null, 4);
                    return;
                }
                return;
            case 1:
                C2275.m4325((View) this.f6441, (C0460) this.f6439, (C2346) this.f6440);
                ((ValueAnimator) this.f6438).start();
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                BinderC5179 binderC5179 = (BinderC5179) this.f6441;
                String str = (String) this.f6439;
                C3954 c3954 = (C3954) this.f6440;
                InterfaceC0277 interfaceC0277 = (InterfaceC0277) this.f6438;
                C5034 c5034 = binderC5179.f17131;
                c5034.m8494();
                c5034.mo2406().mo6517();
                c5034.m8490();
                C1159 c1159 = c5034.f16670;
                C5034.m8484(c1159);
                List<C1212> listM2467 = c1159.m2467(str, c3954, ((Integer) AbstractC4936.f16303.m4592(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (C1212 c1212 : listM2467) {
                    String str2 = c1212.f4186;
                    long j = c1212.f4190;
                    long j2 = c1212.f4191;
                    if (c5034.m8496(str, str2)) {
                        int i2 = c1212.f4193;
                        if (i2 > 0) {
                            if (i2 <= ((Integer) AbstractC4936.f16262.m4592(bArrMo6905)).intValue()) {
                                long jMin = Math.min(((Long) AbstractC4936.f16327.m4592(bArrMo6905)).longValue() * (1 << (i2 - 1)), ((Long) AbstractC4936.f16281.m4592(bArrMo6905)).longValue());
                                c5034.mo2403().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : c1212.f4192.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    c5571 = new C5571(c1212.f4191, c1212.f4189.m5754(), c1212.f4186, bundle, c1212.f4187.f6473, c1212.f4194, "");
                                    try {
                                        c0231 = (C0231) C3117.m5718(C2533.m4748(), c5571.f18402);
                                        for (i = 0; i < ((C2533) c0231.f3388).m4751(); i++) {
                                            C4192 c4192 = (C4192) ((C2533) c0231.f3388).m4754(i).m8829();
                                            c5034.mo2403().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            c4192.m1979();
                                            ((C2523) c4192.f3388).m4731(jCurrentTimeMillis);
                                            c0231.m1979();
                                            ((C2533) c0231.f3388).m4749(i, (C2523) c4192.m1977());
                                        }
                                        c5571.f18402 = ((C2533) c0231.m1977()).m5754();
                                        if (Log.isLoggable(c5034.mo2404().m6441(), 2)) {
                                            C3117 c3117 = c5034.f16692;
                                            C5034.m8484(c3117);
                                            c5571.f18401 = c3117.m5725((C2533) c0231.m1977());
                                        }
                                        arrayList.add(c5571);
                                    } catch (C5463 unused) {
                                        c5034.mo2404().f12022.m9430(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            c5034.mo2404().f12023.m9431("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r6.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            c5571 = new C5571(c1212.f4191, c1212.f4189.m5754(), c1212.f4186, bundle, c1212.f4187.f6473, c1212.f4194, "");
                            c0231 = (C0231) C3117.m5718(C2533.m4748(), c5571.f18402);
                            while (i < ((C2533) c0231.f3388).m4751()) {
                                C4192 c4193 = (C4192) ((C2533) c0231.f3388).m4754(i).m8829();
                                c5034.mo2403().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                c4193.m1979();
                                ((C2523) c4193.f3388).m4731(jCurrentTimeMillis2);
                                c0231.m1979();
                                ((C2533) c0231.f3388).m4749(i, (C2523) c4193.m1977());
                            }
                            c5571.f18402 = ((C2533) c0231.m1977()).m5754();
                            if (Log.isLoggable(c5034.mo2404().m6441(), 2)) {
                                C3117 c3118 = c5034.f16692;
                                C5034.m8484(c3118);
                                c5571.f18401 = c3118.m5725((C2533) c0231.m1977());
                            }
                            arrayList.add(c5571);
                        }
                        bArrMo6905 = null;
                    } else {
                        c5034.mo2404().f12023.m9431("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), c1212.f4186);
                    }
                }
                try {
                    interfaceC0277.mo582(new C0795(arrayList));
                    c5034.mo2404().f12023.m9434(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    c5034.mo2404().f12020.m9434(str, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5695 c5695M9028 = ((AppMeasurementDynamiteService) this.f6438).f309.m9028();
                InterfaceC3838 interfaceC3838 = (InterfaceC3838) this.f6441;
                C2679 c2679 = (C2679) this.f6439;
                String str3 = (String) this.f6440;
                c5695M9028.mo6517();
                c5695M9028.m7643();
                C5371 c5371 = (C5371) c5695M9028.f18660;
                C1512 c1512 = c5371.f17721;
                C5371.m9021(c1512);
                if (C0600.f2225.m1308(((C5371) c1512.f18660).f17739, 12451000) == 0) {
                    c5695M9028.m9509(new RunnableC1948(c5695M9028, c2679, str3, interfaceC3838, 9));
                    return;
                }
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9432("Not bundling data. Service unavailable or out of date");
                C1512 c1513 = c5371.f17721;
                C5371.m9021(c1513);
                c1513.m3228(interfaceC3838, new byte[0]);
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                BinderC5179 binderC51710 = (BinderC5179) this.f6441;
                Bundle bundle2 = (Bundle) this.f6439;
                String str4 = (String) this.f6440;
                C5855 c5855 = (C5855) this.f6438;
                boolean zIsEmpty = bundle2.isEmpty();
                C5034 c5035 = binderC51710.f17131;
                if (zIsEmpty) {
                    C1159 c11510 = c5035.f16670;
                    C5034.m8484(c11510);
                    c11510.mo6517();
                    c11510.m4637();
                    try {
                        c11510.m2463().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        C3610 c3611 = ((C5371) c11510.f18660).f17717;
                        C5371.m9020(c3611);
                        c3611.f12020.m9430(e2, "Error clearing default event params");
                        return;
                    }
                }
                C1159 c11511 = c5035.f16670;
                C5034.m8484(c11511);
                C5371 c5372 = (C5371) c11511.f18660;
                c11511.mo6517();
                c11511.m4637();
                C1832 c1832 = new C1832((C5371) c11511.f18660, "", str4, "dep", 0L, 0L, 0L, bundle2);
                C3117 c3119 = c11511.f19371.f16692;
                C5034.m8484(c3119);
                byte[] bArrM5754 = c3119.m5721(c1832).m5754();
                C3610 c3612 = c5372.f17717;
                C5371.m9020(c3612);
                c3612.f12023.m9434(str4, Integer.valueOf(bArrM5754.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrM5754);
                try {
                    if (c11511.m2463().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        C5371.m9020(c3612);
                        c3612.f12020.m9430(C3610.m6440(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    C5371.m9020(c3612);
                    c3612.f12020.m9434(C3610.m6440(str4), e3, "Error storing default event parameters. appId");
                }
                C1159 c11512 = c5035.f16670;
                C5034.m8484(c11512);
                long j3 = c5855.f19323;
                try {
                    if (c11512.m2468(0L, "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}) <= 0 && c11512.m2468(0L, "select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}) > 0) {
                        C1159 c11513 = c5035.f16670;
                        C5034.m8484(c11513);
                        c11513.m2454(str4, Long.valueOf(j3), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    C3610 c3613 = ((C5371) c11512.f18660).f17717;
                    C5371.m9020(c3613);
                    c3613.f12020.m9430(e4, "Error checking backfill conditions");
                    return;
                }
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                String str5 = (String) this.f6439;
                String str6 = (String) this.f6440;
                C5695 c5695M9029 = ((C5371) ((C5235) this.f6438).f18660).m9028();
                AtomicReference atomicReference = (AtomicReference) this.f6441;
                c5695M9029.mo6517();
                c5695M9029.m7643();
                c5695M9029.m9509(new RunnableC4438(c5695M9029, atomicReference, str5, str6, c5695M9029.m9517(false)));
                return;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C1223 c1223 = (C1223) this.f6441;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6439;
                Context context = (Context) this.f6440;
                C4705 c4705 = (C4705) this.f6438;
                if ((c1223.f6339 instanceof C0043) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(c4705);
                        return;
                    } catch (IllegalArgumentException e5) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
                        return;
                    }
                }
                return;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5086 c5086 = AbstractC5792.f19084;
                Level level = (Level) this.f6441;
                AbstractC5633 abstractC5633 = (AbstractC5633) c5086.f16877;
                boolean zMo4098 = abstractC5633.mo4098(level);
                String str7 = abstractC5633.f18563;
                ((C1735) AbstractC4049.f13495).getClass();
                C0583.f2176.mo1290(str7, level, zMo4098);
                ((InterfaceC0658) ((InterfaceC0658) (!zMo4098 ? C5086.f16874 : new C2380(c5086, level)).mo4016((Throwable) this.f6439)).mo4015()).mo4014((String) this.f6440, (Object[]) this.f6438);
                return;
            case 8:
                C5695 c5695M90210 = ((AppMeasurementDynamiteService) this.f6438).f309.m9028();
                InterfaceC3838 interfaceC3839 = (InterfaceC3838) this.f6441;
                String str8 = (String) this.f6439;
                String str9 = (String) this.f6440;
                c5695M90210.mo6517();
                c5695M90210.m7643();
                c5695M90210.m9509(new RunnableC4438(c5695M90210, str8, str9, c5695M90210.m9517(false), interfaceC3839));
                return;
            case 9:
                InterfaceC3838 interfaceC38310 = (InterfaceC3838) this.f6440;
                C5695 c5695 = (C5695) this.f6438;
                C5371 c5373 = (C5371) c5695.f18660;
                try {
                    try {
                        InterfaceC5253 interfaceC5253 = c5695.f18733;
                        if (interfaceC5253 != null) {
                            bArrMo6905 = interfaceC5253.mo6905((String) this.f6439, (C2679) this.f6441);
                            c5695.m9520();
                            return;
                        } else {
                            C3610 c3614 = c5373.f17717;
                            C5371.m9020(c3614);
                            c3614.f12020.m9432("Discarding data. Failed to send event to service to bundle");
                            return;
                        }
                    } catch (RemoteException e6) {
                        C3610 c3615 = c5373.f17717;
                        C5371.m9020(c3615);
                        c3615.f12020.m9430(e6, "Failed to send event to the service to bundle");
                    }
                } finally {
                    C1512 c1514 = c5373.f17721;
                    C5371.m9021(c1514);
                    c1514.m3228(interfaceC38310, null);
                }
                break;
            case 10:
                C5695 c5696 = (C5695) this.f6441;
                AtomicReference atomicReference2 = (AtomicReference) this.f6439;
                C5855 c5856 = (C5855) this.f6440;
                Bundle bundle3 = (Bundle) this.f6438;
                synchronized (atomicReference2) {
                    try {
                        InterfaceC5253 interfaceC5254 = c5696.f18733;
                        if (interfaceC5254 != null) {
                            interfaceC5254.mo6910(c5856, bundle3, new BinderC1365(c5696, atomicReference2));
                            c5696.m9520();
                            return;
                        } else {
                            C3610 c3616 = ((C5371) c5696.f18660).f17717;
                            C5371.m9020(c3616);
                            c3616.f12020.m9432("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        C3610 c3617 = ((C5371) c5696.f18660).f17717;
                        C5371.m9020(c3617);
                        c3617.f12020.m9430(e7, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 11:
                C5695 c5697 = (C5695) this.f6441;
                AtomicReference atomicReference3 = (AtomicReference) this.f6439;
                C5855 c5857 = (C5855) this.f6440;
                C3954 c3955 = (C3954) this.f6438;
                synchronized (atomicReference3) {
                    try {
                        InterfaceC5253 interfaceC5255 = c5697.f18733;
                        if (interfaceC5255 != null) {
                            interfaceC5255.mo6907(c5857, c3955, new BinderC1255(c5697, atomicReference3));
                            c5697.m9520();
                            return;
                        } else {
                            C3610 c3618 = ((C5371) c5697.f18660).f17717;
                            C5371.m9020(c3618);
                            c3618.f12020.m9432("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e8) {
                        C3610 c3619 = ((C5371) c5697.f18660).f17717;
                        C5371.m9020(c3619);
                        c3619.f12020.m9430(e8, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            default:
                C5034 c5036 = ((C3090) this.f6438).f10371;
                C1512 c1512M8534 = c5036.m8534();
                c5036.mo2403().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (c5036.m8519().m1162(null, AbstractC4936.f19565)) {
                    c5036.mo2403().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                Bundle bundle4 = (Bundle) this.f6440;
                String str10 = (String) this.f6439;
                String str11 = (String) this.f6441;
                C2679 c2679M3224 = c1512M8534.m3224(str10, bundle4, "auto", jCurrentTimeMillis3, jElapsedRealtime, false);
                AbstractC0487.m1047(c2679M3224);
                c5036.m8509(str11, c2679M3224);
                return;
        }
    }

    public /* synthetic */ RunnableC1948(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f6442 = i;
        this.f6441 = obj;
        this.f6439 = obj2;
        this.f6440 = obj3;
        this.f6438 = obj4;
    }

    public /* synthetic */ RunnableC1948(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f6442 = i;
        this.f6438 = obj;
        this.f6441 = obj2;
        this.f6439 = obj3;
        this.f6440 = obj4;
    }
}
