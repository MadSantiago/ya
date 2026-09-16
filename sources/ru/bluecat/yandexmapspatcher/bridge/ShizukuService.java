package ru.bluecat.yandexmapspatcher.bridge;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import p000.AbstractC0684;
import p000.AbstractC0973;
import p000.AbstractC3831;
import p000.AbstractC4009;
import p000.AbstractC4554;
import p000.C2244;
import p000.C3657;
import p000.C4441;
import p000.InterfaceC1897;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ShizukuService extends Binder implements InterfaceC1897 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ int f401 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f402;

    public ShizukuService(Context context) {
        attachInterface(this, new C4441(new long[]{9052987194224580810L, 1699555721909209624L, -1067944639259200634L, -2201318115628887409L, 6726850412900368990L, -980917164374750250L, -2341013671925983003L}).toString());
        this.f402 = context;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws IOException {
        String string = new C4441(new long[]{-1438916816250257715L, 6496839797509860272L, 6375810103021935586L, -2167602295489573064L, 3190787803657073052L, -3601578884083250254L, 6554917407457972750L}).toString();
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(string);
        }
        if (i == 1598968902) {
            parcel2.writeString(string);
            return true;
        }
        if (i == 2) {
            mo161();
            parcel2.writeNoException();
        } else if (i == 3) {
            mo164(parcel.readString());
            parcel2.writeNoException();
        } else if (i == 4) {
            mo162(parcel.readString());
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                if (i != 16777115) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                System.exit(0);
                throw new RuntimeException(new C4441(new long[]{7625234545569127985L, -2061512684705339397L, 1322794538565235974L, 4976864273804014516L, 8032487295590253647L, 6462312617031770217L, -8556231992001945932L, -2951964735402853777L, 1669050311371534907L, 6684394687047651407L}).toString());
            }
            mo163(parcel.readString());
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // p000.InterfaceC1897
    /* JADX INFO: renamed from: ۥؔ */
    public final void mo161() {
        Object next;
        Object systemService = this.f402.getSystemService(new C4441(new long[]{5667574063934826919L, 7893669985230813806L}).toString());
        new C4441(new long[]{644941434217933809L, -506644753127578336L, 2979173961631619689L, 4600205229995210168L, -8226312669595574918L, 4717639438518128356L, -383358504547733357L, 2908109050279564771L, -2924241850298783672L}).toString();
        ActivityManager activityManager = (ActivityManager) systemService;
        Iterator<T> it = activityManager.getRunningAppProcesses().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC3831.m6874(((ActivityManager.RunningAppProcessInfo) next).processName, new C4441(new long[]{8062229963405539145L, 3821946328527280829L, -2584276842525450169L, -2055939559715747605L}).toString()));
        if (((ActivityManager.RunningAppProcessInfo) next) != null) {
            C2244 c2244M5751 = AbstractC4009.m7163(activityManager).m5751();
            c2244M5751.f9027 = new C4441(new long[]{-4528792702408027373L, 2420871435029196889L, 2070846211134575192L}).toString();
            ((C3657) AbstractC0973.m2045(c2244M5751.m4293())).m6534(new C4441(new long[]{2004200893242605154L, 194686693298591640L, -5663640779322427327L, -8228468642554506281L}).toString());
        }
    }

    @Override // p000.InterfaceC1897
    /* JADX INFO: renamed from: ۥَ */
    public final void mo162(String str) throws IOException {
        String string;
        Path path = Paths.get(str, new String[0]);
        new C4441(new long[]{8498203061836208329L, -8095737581090894005L}).toString();
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, new C4441(new long[]{5299444236343415818L, -6545596222667867385L}).toString());
        try {
            for (Path path2 : directoryStreamNewDirectoryStream) {
                Path fileName = path2.getFileName();
                if (fileName == null || (string = fileName.toString()) == null) {
                    string = "";
                } else {
                    int iM1519 = AbstractC0684.m1519(6, string, ".");
                    if (iM1519 != -1) {
                        string = string.substring(0, iM1519);
                    }
                }
                if (string.equals(new C4441(new long[]{8792389102592060933L, -2300394529752189483L}).toString())) {
                    Files.delete(path2);
                }
            }
            directoryStreamNewDirectoryStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC4554.m7932(directoryStreamNewDirectoryStream, th);
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC1897
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo163(String str) throws IOException {
        Path path = Paths.get(str, new String[0]);
        new C4441(new long[]{-4935477409154256345L, 8784334358658858919L}).toString();
        Files.deleteIfExists(path);
    }

    @Override // p000.InterfaceC1897
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo164(String str) throws IOException {
        Intent launchIntentForPackage = this.f402.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            Runtime.getRuntime().exec("am start " + str + "/" + launchIntentForPackage.getComponent().getClassName());
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
