package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: ۦٌۚؕۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5179 extends AbstractBinderC1892 implements InterfaceC5253 {

    /* JADX INFO: renamed from: ۥْ */
    public String f17129;

    /* JADX INFO: renamed from: ۦ۟ */
    public Boolean f17130;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5034 f17131;

    public BinderC5179(C5034 c5034) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        AbstractC0487.m1047(c5034);
        this.f17131 = c5034;
        this.f17129 = null;
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo6903(long j, String str, String str2, String str3) {
        m8782(new RunnableC3883(this, str2, str3, str, j, 0));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8780(C5855 c5855) {
        AbstractC0487.m1047(c5855);
        String str = c5855.f19339;
        AbstractC0487.m1090(str);
        m8781(str, false);
        this.f17131.m8534().m3218(c5855.f19337);
    }

    /* JADX INFO: renamed from: ۥٍ */
    public final void m8781(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5034 c5034 = this.f17131;
        if (zIsEmpty) {
            c5034.mo2404().f12020.m9432("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                Boolean boolValueOf = this.f17130;
                if (boolValueOf == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f17129) && !AbstractC1631.m3413(c5034.f16665.f17739, Binder.getCallingUid()) && !C3225.m5951(c5034.f16665.f17739).m5954(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    boolValueOf = Boolean.valueOf(z2);
                    this.f17130 = boolValueOf;
                }
                if (boolValueOf.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                c5034.mo2404().f12020.m9430(C3610.m6440(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f17129 == null) {
            Context context = c5034.f16665.f17739;
            int callingUid = Binder.getCallingUid();
            int i = AbstractC2292.f7616;
            if (AbstractC1631.m3417(callingUid, context, str)) {
                this.f17129 = str;
            }
        }
        if (str.equals(this.f17129)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥّ */
    public final C1103 mo6904(C5855 c5855) {
        m8780(c5855);
        String str = c5855.f19339;
        AbstractC0487.m1090(str);
        C5034 c5034 = this.f17131;
        try {
            return (C1103) c5034.mo2406().m6518(new CallableC4308(this, c5855, 2)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c5034.mo2404().f12020.m9434(C3610.m6440(str), e, "Failed to get consent. appId");
            return new C1103(null);
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥْ */
    public final byte[] mo6905(String str, C2679 c2679) {
        AbstractC0487.m1090(str);
        AbstractC0487.m1047(c2679);
        m8781(str, true);
        C5034 c5034 = this.f17131;
        C5590 c5590 = c5034.mo2404().f12015;
        C5371 c5371 = c5034.f16665;
        C4004 c4004 = c5371.f17731;
        String str2 = c2679.f8889;
        c5590.m9430(c4004.m7146(str2), "Log and bundle. event");
        c5034.mo2403().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) c5034.mo2406().m6518(new CallableC2229(this, c2679, str)).get();
            if (bArr == null) {
                c5034.mo2404().f12020.m9430(C3610.m6440(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            c5034.mo2403().getClass();
            c5034.mo2404().f12015.m9431("Log and bundle processed. event, size, time_ms", c5371.f17731.m7146(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            c5034.mo2404().f12020.m9431("Failed to log and bundle. appId, event, error", C3610.m6440(str), c5371.f17731.m7146(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            c5034.mo2404().f12020.m9431("Failed to log and bundle. appId, event, error", C3610.m6440(str), c5371.f17731.m7146(str2), e);
            return null;
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥ٘ */
    public final void mo6906(C5855 c5855) {
        String str = c5855.f19339;
        AbstractC0487.m1090(str);
        m8781(str, false);
        m8782(new RunnableC3461(this, c5855, 3));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥٙ */
    public final void mo6907(C5855 c5855, C3954 c3954, InterfaceC0277 interfaceC0277) {
        m8780(c5855);
        String str = c5855.f19339;
        AbstractC0487.m1047(str);
        this.f17131.mo2406().m6515(new RunnableC1948(this, str, c3954, interfaceC0277, 2, false));
    }

    /* JADX INFO: renamed from: ۥٚ */
    public final void m8782(Runnable runnable) {
        C5034 c5034 = this.f17131;
        if (c5034.mo2406().m6519()) {
            runnable.run();
        } else {
            c5034.mo2406().m6515(runnable);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8783(Runnable runnable) {
        C5034 c5034 = this.f17131;
        if (c5034.mo2406().m6519()) {
            runnable.run();
        } else {
            c5034.mo2406().m6520(runnable);
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo6908(Bundle bundle, C5855 c5855) {
        m8780(c5855);
        String str = c5855.f19339;
        AbstractC0487.m1047(str);
        m8782(new RunnableC1948(this, bundle, str, c5855, 4, false));
    }

    @Override // p000.AbstractBinderC1892
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo479(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        C5034 c5034 = this.f17131;
        ArrayList arrayList = null;
        InterfaceC0415 c0853 = null;
        InterfaceC0277 c1278 = null;
        int i2 = 1;
        switch (i) {
            case 1:
                C2679 c2679 = (C2679) AbstractC5564.m9346(parcel, C2679.CREATOR);
                C5855 c5855 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6922(c2679, c5855);
                parcel2.writeNoException();
                return true;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1477 c1477 = (C1477) AbstractC5564.m9346(parcel, C1477.CREATOR);
                C5855 c5856 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6921(c1477, c5856);
                parcel2.writeNoException();
                return true;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5855 c5857 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6917(c5857);
                parcel2.writeNoException();
                return true;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C2679 c26710 = (C2679) AbstractC5564.m9346(parcel, C2679.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                AbstractC5564.m9347(parcel);
                AbstractC0487.m1047(c26710);
                AbstractC0487.m1090(string);
                m8781(string, true);
                m8782(new RunnableC0624(this, c26710, string, 4));
                parcel2.writeNoException();
                return true;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C5855 c5858 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6923(c5858);
                parcel2.writeNoException();
                return true;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5855 c5859 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                z = parcel.readInt() != 0;
                AbstractC5564.m9347(parcel);
                m8780(c5859);
                String str = c5859.f19339;
                AbstractC0487.m1047(str);
                try {
                    List<C1284> list2 = (List) c5034.mo2406().m6521(new CallableC4308(this, str, i2)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (C1284 c1284 : list2) {
                        if (z || !C1512.m3188(c1284.f4384)) {
                            arrayList2.add(new C1477(c1284));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    c5034.mo2404().f12020.m9434(C3610.m6440(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e2) {
                    e = e2;
                    c5034.mo2404().f12020.m9434(C3610.m6440(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C2679 c26711 = (C2679) AbstractC5564.m9346(parcel, C2679.CREATOR);
                String string2 = parcel.readString();
                AbstractC5564.m9347(parcel);
                byte[] bArrMo6905 = mo6905(string2, c26711);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo6905);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC5564.m9347(parcel);
                mo6903(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                C5855 c58510 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                String strMo6912 = mo6912(c58510);
                parcel2.writeNoException();
                parcel2.writeString(strMo6912);
                return true;
            case 12:
                C1513 c1513 = (C1513) AbstractC5564.m9346(parcel, C1513.CREATOR);
                C5855 c58511 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6924(c1513, c58511);
                parcel2.writeNoException();
                return true;
            case 13:
                C1513 c1514 = (C1513) AbstractC5564.m9346(parcel, C1513.CREATOR);
                AbstractC5564.m9347(parcel);
                AbstractC0487.m1047(c1514);
                AbstractC0487.m1047(c1514.f5138);
                AbstractC0487.m1090(c1514.f5147);
                m8781(c1514.f5147, true);
                m8782(new RunnableC4985(24, this, new C1513(c1514), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = AbstractC5564.f18370;
                z = parcel.readInt() != 0;
                C5855 c58512 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                List listMo6918 = mo6918(string6, string7, z, c58512);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo6918);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC5564.f18370;
                z = parcel.readInt() != 0;
                AbstractC5564.m9347(parcel);
                List listMo6916 = mo6916(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo6916);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                C5855 c58513 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                List listMo6915 = mo6915(string11, string12, c58513);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo6915);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC5564.m9347(parcel);
                List listMo6914 = mo6914(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo6914);
                return true;
            case 18:
                C5855 c58514 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6906(c58514);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                C5855 c58515 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6908(bundle, c58515);
                parcel2.writeNoException();
                return true;
            case 20:
                C5855 c58516 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6909(c58516);
                parcel2.writeNoException();
                return true;
            case 21:
                C5855 c58517 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                C1103 c1103Mo6904 = mo6904(c58517);
                parcel2.writeNoException();
                if (c1103Mo6904 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c1103Mo6904.writeToParcel(parcel2, 1);
                return true;
            case 24:
                C5855 c58518 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                AbstractC5564.m9347(parcel);
                m8780(c58518);
                String str2 = c58518.f19339;
                AbstractC0487.m1047(str2);
                if (!c5034.m8519().m1162(null, AbstractC4936.f16287)) {
                    try {
                        list = (List) c5034.mo2406().m6521(new CallableC3930(this, c58518, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        c5034.mo2404().f12020.m9434(C3610.m6440(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) c5034.mo2406().m6518(new CallableC3930(this, c58518, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        c5034.mo2404().f12020.m9434(C3610.m6440(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                C5855 c58519 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6913(c58519);
                parcel2.writeNoException();
                return true;
            case 26:
                C5855 c58520 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6911(c58520);
                parcel2.writeNoException();
                return true;
            case 27:
                C5855 c58521 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6920(c58521);
                parcel2.writeNoException();
                return true;
            case 29:
                C5855 c58522 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                C3954 c3954 = (C3954) AbstractC5564.m9346(parcel, C3954.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c1278 = iInterfaceQueryLocalInterface instanceof InterfaceC0277 ? (InterfaceC0277) iInterfaceQueryLocalInterface : new C1278(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                AbstractC5564.m9347(parcel);
                mo6907(c58522, c3954, c1278);
                parcel2.writeNoException();
                return true;
            case 30:
                C5855 c58523 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                C0323 c0323 = (C0323) AbstractC5564.m9346(parcel, C0323.CREATOR);
                AbstractC5564.m9347(parcel);
                mo6919(c58523, c0323);
                parcel2.writeNoException();
                return true;
            case 31:
                C5855 c58524 = (C5855) AbstractC5564.m9346(parcel, C5855.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c0853 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0415 ? (InterfaceC0415) iInterfaceQueryLocalInterface2 : new C0853(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                AbstractC5564.m9347(parcel);
                mo6910(c58524, bundle3, c0853);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥۤ */
    public final void mo6909(C5855 c5855) {
        AbstractC0487.m1090(c5855.f19339);
        AbstractC0487.m1047(c5855.f19329);
        m8783(new RunnableC3461(this, c5855, 4));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥۥ */
    public final void mo6910(C5855 c5855, Bundle bundle, InterfaceC0415 interfaceC0415) {
        m8780(c5855);
        String str = c5855.f19339;
        AbstractC0487.m1047(str);
        this.f17131.mo2406().m6515(new RunnableC4438(this, c5855, bundle, interfaceC0415, str));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۥۨ */
    public final void mo6911(C5855 c5855) {
        AbstractC0487.m1090(c5855.f19339);
        AbstractC0487.m1047(c5855.f19329);
        m8783(new RunnableC3461(this, c5855, 5));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦؔ */
    public final String mo6912(C5855 c5855) {
        m8780(c5855);
        C5034 c5034 = this.f17131;
        try {
            return (String) c5034.mo2406().m6521(new CallableC4308(c5034, c5855)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c5034.mo2404().f12020.m9434(C3610.m6440(c5855.f19339), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦؖ */
    public final void mo6913(C5855 c5855) {
        AbstractC0487.m1090(c5855.f19339);
        AbstractC0487.m1047(c5855.f19329);
        m8783(new RunnableC3461(this, c5855, 6));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦؙ */
    public final List mo6914(String str, String str2, String str3) {
        m8781(str, true);
        C5034 c5034 = this.f17131;
        try {
            return (List) c5034.mo2406().m6521(new CallableC3870(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            c5034.mo2404().f12020.m9430(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦُ */
    public final List mo6915(String str, String str2, C5855 c5855) {
        m8780(c5855);
        String str3 = c5855.f19339;
        AbstractC0487.m1047(str3);
        C5034 c5034 = this.f17131;
        try {
            return (List) c5034.mo2406().m6521(new CallableC3870(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            c5034.mo2404().f12020.m9430(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦِ */
    public final List mo6916(String str, String str2, String str3, boolean z) {
        m8781(str, true);
        C5034 c5034 = this.f17131;
        try {
            List<C1284> list = (List) c5034.mo2406().m6521(new CallableC3870(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1284 c1284 : list) {
                if (z || !C1512.m3188(c1284.f4384)) {
                    arrayList.add(new C1477(c1284));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            c5034.mo2404().f12020.m9434(C3610.m6440(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            c5034.mo2404().f12020.m9434(C3610.m6440(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦٗ */
    public final void mo6917(C5855 c5855) {
        m8780(c5855);
        m8782(new RunnableC3461(this, c5855, 0));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦٝ */
    public final List mo6918(String str, String str2, boolean z, C5855 c5855) {
        m8780(c5855);
        String str3 = c5855.f19339;
        AbstractC0487.m1047(str3);
        C5034 c5034 = this.f17131;
        try {
            List<C1284> list = (List) c5034.mo2406().m6521(new CallableC3870(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1284 c1284 : list) {
                if (z || !C1512.m3188(c1284.f4384)) {
                    arrayList.add(new C1477(c1284));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            c5034.mo2404().f12020.m9434(C3610.m6440(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            c5034.mo2404().f12020.m9434(C3610.m6440(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦٞ */
    public final void mo6919(C5855 c5855, C0323 c0323) {
        m8780(c5855);
        m8782(new RunnableC0624(6, this, c5855, c0323, false));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦۜ */
    public final void mo6920(C5855 c5855) {
        m8780(c5855);
        m8782(new RunnableC3461(this, c5855, 1));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦ۠ */
    public final void mo6921(C1477 c1477, C5855 c5855) {
        AbstractC0487.m1047(c1477);
        m8780(c5855);
        m8782(new RunnableC0624(this, c1477, c5855, 5));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦۣ */
    public final void mo6922(C2679 c2679, C5855 c5855) {
        AbstractC0487.m1047(c2679);
        m8780(c5855);
        m8782(new RunnableC0624(this, c2679, c5855, 3));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦۧ */
    public final void mo6923(C5855 c5855) {
        m8780(c5855);
        m8782(new RunnableC3461(this, c5855, 2));
    }

    @Override // p000.InterfaceC5253
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo6924(C1513 c1513, C5855 c5855) {
        AbstractC0487.m1047(c1513);
        AbstractC0487.m1047(c1513.f5138);
        m8780(c5855);
        C1513 c1514 = new C1513(c1513);
        c1514.f5147 = c5855.f19339;
        m8782(new RunnableC0624(this, c1514, c5855, 2));
    }
}
