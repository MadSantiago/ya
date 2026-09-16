package p000;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥؗؖۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0624 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public Object f2311;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f2312;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f2313;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2314;

    public RunnableC0624(C5695 c5695, AtomicReference atomicReference, C5855 c5855) {
        this.f2314 = 7;
        this.f2313 = atomicReference;
        this.f2311 = c5855;
        Objects.requireNonNull(c5695);
        this.f2312 = c5695;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f9  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        C5645 c5645;
        Cursor cursor;
        int i;
        long j;
        Cursor cursorQuery;
        C1212 c1212M2434;
        Cursor cursor2;
        AtomicReference atomicReference;
        C1512 c1512;
        String strMo6912 = null;
        switch (this.f2314) {
            case 0:
                C3943 c3943 = (C3943) this.f2312;
                C3384 c3384 = (C3384) this.f2313;
                c3943.m7104(c3384, (C2332) this.f2311);
                ((AtomicInteger) c3943.f13165.f11254).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(c3943.f13160, c3943.m7105()) * (60000.0d / c3943.f13162));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + c3384.f11281;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 1:
                try {
                    objCall = ((CallableC0421) this.f2313).call();
                    break;
                } catch (Exception unused2) {
                    objCall = null;
                }
                ((Handler) this.f2312).post(new RunnableC4985(10, (C3334) this.f2311, objCall));
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5034 c5034 = ((BinderC5179) this.f2312).f17131;
                c5034.m8494();
                C1513 c1513 = (C1513) this.f2313;
                Object objM3090 = c1513.f5138.m3090();
                C5855 c5855 = (C5855) this.f2311;
                if (objM3090 == null) {
                    c5034.m8516(c1513, c5855);
                    return;
                } else {
                    c5034.m8513(c1513, c5855);
                    return;
                }
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C2679 c2679 = (C2679) this.f2313;
                C5855 c5856 = (C5855) this.f2311;
                C5034 c5035 = ((BinderC5179) this.f2312).f17131;
                if ("_cmp".equals(c2679.f8889) && (c5645 = c2679.f8888) != null) {
                    Bundle bundle = c5645.f18597;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            c5035.mo2404().f12016.m9430(c2679.toString(), "Event has been filtered ");
                            c2679 = new C2679("_cmpx", c5645, c2679.f8886, c2679.f8887, c2679.f8885);
                        }
                    }
                }
                String str2 = c2679.f8889;
                C3040 c3040 = c5035.f16698;
                C3117 c3117 = c5035.f16692;
                C5034.m8484(c3040);
                String str3 = c5856.f19339;
                C3924 c3924 = TextUtils.isEmpty(str3) ? null : (C3924) c3040.f10220.m4035(str3);
                if (c3924 == null) {
                    c5035.mo2404().f12023.m9430(c5856.f19339, "EES not loaded for");
                    c5035.m8494();
                    c5035.m8527(c2679, c5856);
                    return;
                }
                try {
                    C5460 c5460 = c3924.f13080;
                    C5034.m8484(c3117);
                    HashMap mapM5710 = C3117.m5710(c2679.f8888.m9478(), true);
                    String strM1948 = AbstractC0949.m1948(str2, AbstractC1605.f5399, AbstractC1605.f5396);
                    if (strM1948 == null) {
                        strM1948 = str2;
                    }
                    if (c3924.m7024(new C0606(strM1948, c2679.f8887, mapM5710))) {
                        if (((C0606) c5460.f17999).equals((C0606) c5460.f18001)) {
                            c5035.m8494();
                            c5035.m8527(c2679, c5856);
                        } else {
                            c5035.mo2404().f12023.m9430(str2, "EES edited event");
                            C5034.m8484(c3117);
                            C2679 c2679M5716 = C3117.m5716((C0606) c5460.f17999);
                            c5035.m8494();
                            c5035.m8527(c2679M5716, c5856);
                        }
                        if (((ArrayList) c5460.f18000).isEmpty()) {
                            return;
                        }
                        for (C0606 c0606 : (ArrayList) c5460.f18000) {
                            c5035.mo2404().f12023.m9430(c0606.f2281, "EES logging created event");
                            C5034.m8484(c3117);
                            C2679 c2679M5717 = C3117.m5716(c0606);
                            c5035.m8494();
                            c5035.m8527(c2679M5717, c5856);
                        }
                        return;
                    }
                } catch (C0898 unused3) {
                    c5035.mo2404().f12020.m9434(c5856.f19337, str2, "EES error. appId, eventName");
                }
                c5035.mo2404().f12023.m9430(str2, "EES was not applied to event");
                c5035.m8494();
                c5035.m8527(c2679, c5856);
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5034 c5036 = ((BinderC5179) this.f2312).f17131;
                c5036.m8494();
                c5036.m8509((String) this.f2311, (C2679) this.f2313);
                return;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5034 c5037 = ((BinderC5179) this.f2312).f17131;
                c5037.m8494();
                C1477 c1477 = (C1477) this.f2313;
                Object objM3091 = c1477.m3090();
                C5855 c5857 = (C5855) this.f2311;
                if (objM3091 == null) {
                    c5037.m8510(c1477.f5025, c5857);
                    return;
                } else {
                    c5037.m8493(c1477, c5857);
                    return;
                }
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                BinderC5179 binderC5179 = (BinderC5179) this.f2313;
                C5855 c5858 = (C5855) this.f2311;
                C0323 c0323 = (C0323) this.f2312;
                C5034 c5038 = binderC5179.f17131;
                c5038.m8494();
                String str4 = c5858.f19339;
                AbstractC0487.m1047(str4);
                HashMap map = c5038.f16685;
                c5038.mo2406().mo6517();
                c5038.m8490();
                C1159 c1159 = c5038.f16670;
                C5034.m8484(c1159);
                long j2 = c0323.f1183;
                long j3 = c0323.f1181;
                c1159.mo6517();
                c1159.m4637();
                try {
                    cursorQuery = c1159.m2463().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(1);
                                AbstractC0487.m1047(string2);
                                try {
                                    try {
                                        j = j3;
                                        cursor2 = cursorQuery;
                                        i = 4;
                                        try {
                                            c1212M2434 = c1159.m2434(string2, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                            cursor2.close();
                                        } catch (SQLiteException e) {
                                            e = e;
                                            cursorQuery = cursor2;
                                            try {
                                                C3610 c3610 = ((C5371) c1159.f18660).f17717;
                                                C5371.m9020(c3610);
                                                c3610.f12020.m9434(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                c1212M2434 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor2 = cursorQuery;
                                        j = j3;
                                        i = 4;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    i = 4;
                                    cursor2 = cursorQuery;
                                    j = j3;
                                }
                            } else {
                                i = 4;
                                j = j3;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                c1212M2434 = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursorQuery;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        i = 4;
                        j = j3;
                        cursor2 = cursorQuery;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    i = 4;
                    j = j3;
                    cursorQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                }
                if (c1212M2434 == null) {
                    c5038.mo2404().f12022.m9434(str4, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                    return;
                }
                String str5 = c1212M2434.f4186;
                int i2 = c0323.f1182;
                if (i2 != 1) {
                    if (i2 == 3) {
                        C1587 c1587 = (C1587) map.get(str5);
                        if (c1587 == null) {
                            c1587 = new C1587(c5038);
                            map.put(str5, c1587);
                        } else {
                            c1587.f5340++;
                            c1587.f5339 = c1587.m3326();
                        }
                        c5038.mo2403().getClass();
                        c5038.mo2404().f12023.m9431("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str5, Long.valueOf((c1587.f5339 - System.currentTimeMillis()) / 1000));
                    }
                    C1159 c11510 = c5038.f16670;
                    C5034.m8484(c11510);
                    Long lValueOf = Long.valueOf(c0323.f1183);
                    c11510.m2423(lValueOf);
                    c5038.mo2404().f12023.m9434(str4, lValueOf, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                    return;
                }
                if (map.containsKey(str5)) {
                    map.remove(str5);
                }
                C1159 c11511 = c5038.f16670;
                C5034.m8484(c11511);
                Long lValueOf2 = Long.valueOf(j2);
                c11511.m2459(lValueOf2);
                c5038.mo2404().f12023.m9434(str4, lValueOf2, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                if (j > 0) {
                    C1159 c11512 = c5038.f16670;
                    C5034.m8484(c11512);
                    C5371 c5371 = (C5371) c11512.f18660;
                    c11512.mo6517();
                    c11512.m4637();
                    Long lValueOf3 = Long.valueOf(j);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", (Integer) 1);
                    C1397 c1397 = c5371.f17719;
                    C3610 c3611 = c5371.f17717;
                    c1397.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    try {
                        if (c11512.m2463().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i)}) != 1) {
                            C5371.m9020(c3611);
                            c3611.f12022.m9434(str4, lValueOf3, "Google Signal pending batch not updated. appId, rowId");
                            break;
                        }
                        c5038.mo2404().f12023.m9434(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                        c5038.m8500(str4);
                        return;
                    } catch (SQLiteException e6) {
                        C5371.m9020(c3611);
                        c3611.f12020.m9431("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e6);
                        throw e6;
                    }
                }
                return;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                AtomicReference atomicReference2 = (AtomicReference) this.f2313;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C5695 c5695 = (C5695) this.f2312;
                            C5371 c5372 = (C5371) c5695.f18660;
                            C4474 c4474 = c5372.f17713;
                            C5371.m9021(c4474);
                            if (c4474.m7754().m8815(EnumC4635.f15299)) {
                                InterfaceC5253 interfaceC5253 = c5695.f18733;
                                if (interfaceC5253 != null) {
                                    atomicReference2.set(interfaceC5253.mo6912((C5855) this.f2311));
                                    String str6 = (String) atomicReference2.get();
                                    if (str6 != null) {
                                        C5235 c5235 = ((C5371) c5695.f18660).f17709;
                                        C5371.m9023(c5235);
                                        c5235.f17284.set(str6);
                                        C4474 c4475 = c5372.f17713;
                                        C5371.m9021(c4475);
                                        c4475.f14771.m2971(str6);
                                    }
                                    c5695.m9520();
                                    atomicReference = (AtomicReference) this.f2313;
                                    atomicReference.notify();
                                    return;
                                }
                                C3610 c3612 = c5372.f17717;
                                C5371.m9020(c3612);
                                c3612.f12020.m9432("Failed to get app instance id");
                            } else {
                                C3610 c3613 = c5372.f17717;
                                C5371.m9020(c3613);
                                c3613.f12021.m9432("Analytics storage consent denied; will not get app instance id");
                                C5235 c5236 = ((C5371) c5695.f18660).f17709;
                                C5371.m9023(c5236);
                                c5236.f17284.set(null);
                                C4474 c4476 = c5372.f17713;
                                C5371.m9021(c4476);
                                c4476.f14771.m2971(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e7) {
                            C3610 c3614 = ((C5371) ((C5695) this.f2312).f18660).f17717;
                            C5371.m9020(c3614);
                            c3614.f12020.m9430(e7, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f2313;
                        }
                    } catch (Throwable th5) {
                        ((AtomicReference) this.f2313).notify();
                        throw th5;
                    }
                }
                break;
            case 8:
                InterfaceC3838 interfaceC3838 = (InterfaceC3838) this.f2311;
                C5695 c5696 = (C5695) this.f2312;
                C5371 c5373 = (C5371) c5696.f18660;
                try {
                    try {
                        C4474 c4477 = c5373.f17713;
                        C3610 c3615 = c5373.f17717;
                        C5371.m9021(c4477);
                        if (c4477.m7754().m8815(EnumC4635.f15299)) {
                            InterfaceC5253 interfaceC5254 = c5696.f18733;
                            if (interfaceC5254 != null) {
                                strMo6912 = interfaceC5254.mo6912((C5855) this.f2313);
                                if (strMo6912 != null) {
                                    C5235 c5237 = c5373.f17709;
                                    C5371.m9023(c5237);
                                    c5237.f17284.set(strMo6912);
                                    C5371.m9021(c4477);
                                    c4477.f14771.m2971(strMo6912);
                                }
                                c5696.m9520();
                                c1512 = c5373.f17721;
                                C5371.m9021(c1512);
                                c1512.m3219(strMo6912, interfaceC3838);
                                return;
                            }
                            C5371.m9020(c3615);
                            c3615.f12020.m9432("Failed to get app instance id");
                        } else {
                            C5371.m9020(c3615);
                            c3615.f12021.m9432("Analytics storage consent denied; will not get app instance id");
                            C5235 c5238 = c5373.f17709;
                            C5371.m9023(c5238);
                            c5238.f17284.set(null);
                            C5371.m9021(c4477);
                            c4477.f14771.m2971(null);
                        }
                        c1512 = c5373.f17721;
                    } catch (RemoteException e8) {
                        C3610 c3616 = c5373.f17717;
                        C5371.m9020(c3616);
                        c3616.f12020.m9430(e8, "Failed to get app instance id");
                    }
                    C5371.m9021(c1512);
                    c1512.m3219(strMo6912, interfaceC3838);
                    return;
                } catch (Throwable th6) {
                    C1512 c1514 = c5373.f17721;
                    C5371.m9021(c1514);
                    c1514.m3219(null, interfaceC3838);
                    throw th6;
                }
            case 9:
                C5695 c5697 = (C5695) this.f2313;
                C5855 c5859 = (C5855) this.f2311;
                C0323 c0324 = (C0323) this.f2312;
                C5371 c5374 = (C5371) c5697.f18660;
                InterfaceC5253 interfaceC5255 = c5697.f18733;
                if (interfaceC5255 == null) {
                    C3610 c3617 = c5374.f17717;
                    C5371.m9020(c3617);
                    c3617.f12020.m9432("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    interfaceC5255.mo6919(c5859, c0324);
                    c5697.m9520();
                    return;
                } catch (RemoteException e9) {
                    C3610 c3618 = c5374.f17717;
                    C5371.m9020(c3618);
                    c3618.f12020.m9434(Long.valueOf(c0324.f1183), e9, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 10:
                C2391 c2391 = (C2391) this.f2313;
                C3610 c3619 = (C3610) this.f2311;
                JobParameters jobParameters = (JobParameters) this.f2312;
                c3619.f12023.m9432("AppMeasurementJobService processed last upload request.");
                ((InterfaceC3258) ((Service) c2391.f7924)).mo114(jobParameters);
                return;
            default:
                if (((C5450) this.f2313).f17965 != null) {
                    C0178.m382();
                    return;
                }
                AbstractC0866 abstractC0866 = (AbstractC0866) this.f2311;
                RunnableC1948 runnableC1948 = (RunnableC1948) this.f2312;
                C1037 c1037M9168 = AbstractC5474.m9168();
                AbstractC0866 abstractC0866M9169 = AbstractC5474.m9169(c1037M9168, abstractC0866);
                try {
                    runnableC1948.run();
                    AbstractC5474.m9169(c1037M9168, abstractC0866M9169);
                    return;
                } catch (Throwable th7) {
                    try {
                        AbstractC1308.m2774(th7);
                        throw th7;
                    } catch (Throwable th8) {
                        AbstractC5474.m9169(c1037M9168, abstractC0866M9169);
                        throw th8;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f2314) {
            case 11:
                RunnableC1948 runnableC1948 = (RunnableC1948) this.f2312;
                StringBuilder sb = new StringBuilder(runnableC1948.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(runnableC1948);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC0624(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f2314 = i;
        this.f2313 = obj;
        this.f2311 = obj2;
        this.f2312 = obj3;
    }

    public /* synthetic */ RunnableC0624(Object obj, Object obj2, Object obj3, int i) {
        this.f2314 = i;
        this.f2312 = obj;
        this.f2313 = obj2;
        this.f2311 = obj3;
    }

    public /* synthetic */ RunnableC0624() {
        this.f2314 = 1;
    }
}
