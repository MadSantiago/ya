package p000;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؘؑؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3048 extends AbstractC1333 {
    @Override // java.io.File
    public final File getAbsoluteFile() {
        return mo2350(getAbsolutePath());
    }

    @Override // java.io.File
    public final File getCanonicalFile() {
        return mo2350(getCanonicalPath());
    }

    @Override // java.io.File
    public final File getParentFile() {
        return mo2350(getParent());
    }

    @Override // java.io.File
    public final File[] listFiles(FilenameFilter filenameFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                arrayList.add(mo2351(str));
            }
        }
        return (AbstractC1333[]) arrayList.toArray(mo2348(0));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract AbstractC1333[] mo2348(int i);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract AbstractC1333 mo2350(String str);

    @Override // java.io.File
    /* JADX INFO: renamed from: ۥۣ, reason: merged with bridge method [inline-methods] */
    public final AbstractC1333[] listFiles() {
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        AbstractC1333[] abstractC1333ArrMo2348 = mo2348(length);
        for (int i = 0; i < length; i++) {
            abstractC1333ArrMo2348[i] = mo2351(list[i]);
        }
        return abstractC1333ArrMo2348;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public abstract AbstractC1333 mo2351(String str);

    @Override // java.io.File
    public final File[] listFiles(FileFilter fileFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC1333 abstractC1333Mo2351 = mo2351(str);
            if (fileFilter == null || fileFilter.accept(abstractC1333Mo2351)) {
                arrayList.add(abstractC1333Mo2351);
            }
        }
        return (AbstractC1333[]) arrayList.toArray(mo2348(0));
    }
}
