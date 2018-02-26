//package com.demo.utils;
//
//
//import com.esudian.domain.mdm.CiipMdmSeqExpansions;
//import com.esudian.domain.mdm.CiipMdmSeqNumBases;
//import com.esudian.domain.oms.CiipOmsNumberOfDinnersHis;
//import com.esudian.domain.org.*;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * author : Sdniu
// * date   : 2017/7/15.
// * description :
// */
//public class CreateServiceJava {
//
//    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
//
//
//    public static String createResource(String modelName, Class clazz) {
//        String simpleName = clazz.getSimpleName();
//        StringBuffer result = new StringBuffer("package com.esudian." + modelName + ".web;");
//        result.append("import com.esudian.domain." + modelName + "." + simpleName + ";\n" +
//                "import com.esudian." + modelName + ".service." + simpleName + "Service;\n" +
//                "import com.github.pagehelper.PageInfo;\n" +
//                "import com.pudding.core.web.BaseController;\n" +
//                "import com.pudding.core.web.ResponseEntity;\n" +
//                "import org.springframework.beans.factory.annotation.Autowired;\n" +
//                "import org.springframework.web.bind.annotation.RequestBody;\n" +
//                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
//                "import org.springframework.web.bind.annotation.RequestMethod;\n" +
//                "import org.springframework.web.bind.annotation.RestController;");
//        result.append("\n@RequestMapping(\"/" + toLowerFirst(simpleName) + "\")");
//        result.append("\n@RestController");
//        result.append("\n");
//        result.append("public class " + simpleName + "Resource extends BaseController {");
//        result.append("\n\t@Autowired");
//        result.append("\n\t");
//        result.append("private " + simpleName + "Service " + toLowerFirst(simpleName) + "Service;");
//        result.append("\n\t");
//        //get
//        result.append("@RequestMapping(value = \"/get\", method = RequestMethod.GET)");
//        result.append("\n\t");
//        result.append("@ResponseBody");
//        result.append("\n\t");
//        result.append("public ResponseEntity<" + simpleName + "> get" + simpleName + "(String id){");
//        result.append("\n\t\t");
//        result.append("return success(" + toLowerFirst(simpleName) + "Service.get" + simpleName + "(id)" + ");");
//        result.append("\n\t}");
//
//        //query
//        result.append("\n\t");
//        result.append("@RequestMapping(value = \"/query\", method = RequestMethod.GET)");
//        result.append("\n\t");
//        result.append("@ResponseBody");
//        result.append("\n\t");
//        result.append("public ResponseEntity<PageInfo<" + simpleName + ">> query(" + simpleName + " " + toLowerFirst(simpleName) + "){");
//        result.append("\n\t\t");
//        result.append("return success(" + toLowerFirst(simpleName) + "Service.find" + simpleName + "(" + toLowerFirst(simpleName) + ")" + ");");
//        result.append("\n\t}");
//
//        //save
//        result.append("\n\t");
//        result.append("@RequestMapping(value = \"/save\", method = RequestMethod.POST)");
//        result.append("\n\t");
//        result.append("@ResponseBody");
//        result.append("\n\t");
//        result.append("public ResponseEntity<" + simpleName + "> save" + simpleName + "(" + simpleName + " " + toLowerFirst(simpleName) + "){");
//        result.append("\n\t\t");
//        result.append("return success(" + toLowerFirst(simpleName) + "Service.save" + simpleName + "(" + toLowerFirst(simpleName) + ")" + ");");
//        result.append("\n\t}");
//        //delete
//        result.append("\n\t");
//        result.append("@RequestMapping(value = \"/delete\", method = RequestMethod.POST)");
//        result.append("\n\t");
//        result.append("@ResponseBody");
//        result.append("\n\t");
//        result.append("public ResponseEntity<" + simpleName + "> save" + simpleName + "(" + simpleName + " " + toLowerFirst(simpleName) + "){");
//        result.append("\n\t\t");
//        result.append("return success(" + toLowerFirst(simpleName) + "Service.save" + simpleName + "(" + toLowerFirst(simpleName) + ")" + ");");
//        result.append("\n\t}");
//
//        result.append("\n}");
//        return result.toString();
//    }
//
//
//    /**
//     * @param clazz
//     * @return
//     */
//    public static String createServiceInterface(String modelName, Class clazz) {
//        String simpleName = clazz.getSimpleName();
//        StringBuffer result = new StringBuffer("package com.esudian." + modelName + ".service;");
//        result.append("\nimport " + clazz.getName() + ";");
//        result.append("\nimport com.github.pagehelper.PageInfo;");
//        result.append("\nimport java.util.List;");
//        result.append("\n/**" +
//                "\n* date " + simpleDateFormat.format(new Date()) +
//                "\n* description " + simpleName + "service" +
//                "\n*/");
//        result.append("\n");
//        result.append("public interface " + simpleName + "Service {");
//
//        //查询单个
//        result.append("\n");
//        result.append("\t/**" +
//                "\n\t 根据id查询" +
//                "\n\t* @param id" +
//                "\n\t* @return " + simpleName +
//                "\n\t*/");
//        result.append("\n");
//        result.append("\tpublic " + simpleName + " get" + simpleName);
//        result.append("(String id);");
//
//        //查询list 不分页 result.append("\n");result.append("\n");
//        result.append("\t/**" +
//                "\n\t* 查询符合条件的数据,不分页" +
//                "\n\t* @param " + toLowerFirst(simpleName) +
//                "\n\t* @return " + "List<" + simpleName + ">" +
//                "\n\t*/");
//        result.append("\n");
//        result.append("\tpublic List<" + simpleName + "> findList" + simpleName);
//        result.append("(" + simpleName + " " + toLowerFirst(simpleName) + ");");
//
//
//        //查询所有 list
//        result.append("\n");
//        result.append("\t/**" +
//                "\n\t 查询所有数据" +
//                "\n\t* @return " + "List<" + simpleName + ">" +
//                "\n\t*/");
//        result.append("\n");
//        result.append("\tpublic List<" + simpleName + "> findAll" + simpleName + "();");
//
//        //查询符合条件的数据,并且分页,默认pageNum=1,pageSize=100
//        result.append("\n");
//        result.append("\t/**" +
//                "\n\t* 查询符合条件的数据,并且分页,默认pageNum=1,pageSize=100 " +
//                "\n\t* @param " + toLowerFirst(simpleName) +
//                "\n\t* @return " + "PageInfo<" + simpleName + ">" +
//                "\n\t*/");
//        result.append("\n");
//        result.append("\tpublic PageInfo<" + simpleName + "> find" + simpleName);
//        result.append("(" + simpleName + " " + toLowerFirst(simpleName) + ");");
//
//
//        result.append("\n");
//        result.append("\t/**" +
//                "\n\t* 保存" +
//                "\n\t* @param " + toLowerFirst(simpleName) +
//                "\n\t* @return " + simpleName +
//                "\n\t*/");
//        result.append("\n");
//        result.append("\tpublic " + simpleName + " save" + simpleName);
//        result.append("(" + simpleName + " " + toLowerFirst(simpleName) + ");");
//        result.append("\n");
//        result.append("\t/**" +
//                "\n\t* 删除符合条件的数据" +
//                "\n\t* @param " + toLowerFirst(simpleName) +
//                "\n\t* @return int 删除条数" +
//                "\n\t*/");
//        result.append("\n");
//        result.append("\tpublic int delete" + simpleName);
//        result.append("(" + simpleName + " " + toLowerFirst(simpleName) + ");");
//        result.append("\n");
//        result.append("}");
//        return result.toString();
//    }
//
//    public static String createServiceInterfaceImpl(String modelName, Class clazz) {
//        String simpleName = clazz.getSimpleName();
//        StringBuffer result = new StringBuffer("package com.esudian." + modelName + ".service.impl;");
//        String mapperProName = toLowerFirst(simpleName) + "Mapper";
//        result.append("\nimport " + clazz.getName() + ";");
//        result.append("\nimport org.springframework.beans.factory.annotation.Autowired;");
//        result.append("\nimport org.springframework.stereotype.Service;");
//        result.append("\nimport com.github.pagehelper.PageHelper;");
//        result.append("\nimport com.github.pagehelper.PageInfo;");
//        result.append("\nimport com.esudian." + modelName + ".service." + simpleName + "Service;");
//        result.append("\nimport com.esudian." + modelName + ".mappers." + simpleName + "Mapper;");
//        result.append("\nimport java.util.List;");
//        result.append("\nimport org.springframework.util.StringUtils;");
//        result.append("\nimport com.github.pagehelper.ISelect;");
//
//
//        result.append("\n/**" +
//                "\n* date " + simpleDateFormat.format(new Date()) +
//                "\n* description " + simpleName + "service" +
//                "\n*/");
//        result.append("\n@Service");
//        result.append("\n");
//        result.append("public class " + simpleName + "ServiceImpl implements " + simpleName + "Service{");
//
//        //Mapper
//        result.append("\n\t@Autowired");
//        result.append("\n\tprivate " + simpleName + "Mapper " + toLowerFirst(simpleName) + "Mapper;");
//
//
//        //查询list 不分页 result.append("\n");result.append("\n");
//        result.append("\n");
//        result.append("\tpublic List<" + simpleName + "> findList" + simpleName);
//        result.append("(" + simpleName + " " + toLowerFirst(simpleName) + "){");
//        result.append("\n\t\t");
//        result.append("return " + mapperProName + ".select(" + toLowerFirst(simpleName) + ");");
//        result.append("\n\t}");
//
//        //查询单个
//        result.append("\n");
//        result.append("\t@Override");
//        result.append("\n");
//        result.append("\tpublic " + simpleName + " get" + simpleName);
//        result.append("(String id){");
//        result.append("\n\t\t");
//        result.append(simpleName + " " + toLowerFirst(simpleName) + " = new " + simpleName + "();");
//        result.append("\n\t\t");
//        result.append("\n\t\t" + toLowerFirst(simpleName) + ".setId(id);");
//        result.append("\n\t\t");
//        result.append("return " + mapperProName + ".selectByPrimaryKey(" + toLowerFirst(simpleName) + ");");
//        result.append("\n\t}");
//
//
//        //查询所有
//        result.append("\n");
//        result.append("\t@Override");
//        result.append("\n");
//        result.append("\tpublic List<" + simpleName + "> findAll" + simpleName);
//        result.append("(){");
//        result.append("\n\t\t");
//        result.append("return " + mapperProName + ".selectAll();");
//        result.append("\n\t}");
//
//
//        //查询符合条件的数据 分页
//        result.append("\n");
//        result.append("\t@Override");
//        result.append("\n");
//        result.append("\tpublic PageInfo<" + simpleName + "> find" + simpleName);
//        result.append("(" + simpleName + " " + toLowerFirst(simpleName) + "){");
//        result.append("\n\t\t");
//        result.append("return PageHelper.startPage(" + toLowerFirst(simpleName) + ".getPageNum(), " + toLowerFirst(simpleName) + ".getPageSize())." +
//                "setOrderBy(" + toLowerFirst(simpleName) + ".getOrderBy()).doSelectPageInfo(new ISelect() {\n" +
//                "            @Override\n" +
//                "            public void doSelect() {\n" +
//                "                " + mapperProName + ".select(" + toLowerFirst(simpleName) + ");\n " +
//                "            }\n" +
//                "        });");
//        result.append("\n\t}");
//
//
//        //保存
//        result.append("\n");
//        result.append("\t@Override");
//        result.append("\n");
//        result.append("\tpublic " + simpleName + " save" + simpleName);
//        result.append("(" + simpleName + " " + toLowerFirst(simpleName) + "){");
//        result.append("\n\t\t");
//        result.append("  if (StringUtils.isEmpty(" + toLowerFirst(simpleName) + ".getId())) {\n" +
//                "            " + mapperProName + ".insert(" + toLowerFirst(simpleName) + ");\n" +
//                "        } else {\n" +
//                "            " + mapperProName + ".updateByPrimaryKeySelective(" + toLowerFirst(simpleName) + ");\n" +
//                "        }");
//
//        result.append("return " + toLowerFirst(simpleName) + ";");
//        result.append("\n\t}");
//
//
//        //删除符合条件的数据
//        result.append("\n");
//        result.append("\t@Override");
//        result.append("\n");
//        result.append("\tpublic int delete" + simpleName);
//        result.append("(" + simpleName + " " + toLowerFirst(simpleName) + "){");
//        result.append("\n\t\t");
//        result.append("return " + mapperProName + ".delete(" + toLowerFirst(simpleName) + ");");
//        result.append("\n\t}");
//        result.append("\n}");
//
//        return result.toString();
//    }
//
//    public static String createMapper(String modelName, Class clazz) {
//        String simpleName = clazz.getSimpleName();
//        StringBuffer result = new StringBuffer("package com.esudian." + modelName + ".mapper;");
//        result.append("\nimport " + clazz.getName() + ";");
//        result.append("\nimport tk.mybatis.mapper.common.Mapper;");
//        result.append("\npublic interface " + simpleName + "Mapper extends Mapper<" + simpleName + ">{");
//        result.append("\n}");
//        return result.toString();
//    }
//
//    private static String toLowerFirst(String name) {
//        return name.substring(0, 1).toLowerCase() + name.substring(1);
//    }
//
//    public static void main(String args[]) throws IOException {
////        createServiceInterface(""+modelName+"", CiipMdmSysMenus.class);
////        createServiceInterfaceImpl(""+modelName+"", CiipMdmSysMenus.class);
////        createdFile("D:\\beans\\", "" + modelName + "", CiipMdmSysMenus.class, CiipMdmSysFunctions.class,
////                CiipMdmSysResources.class, CiipMdmSysRoleAuth.class, CiipMdmSysRoles.class, CiipMdmSysUserAuth.class);
//        SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
//        createdFile("D:\\beans\\" + sdf.format(new Date()) + "\\org\\", "org",
//                CiipOrgDepartments.class);
//
//    }
//
//    public static void createdFile(String text, String fileName) throws IOException {
//        File f = new File(fileName);
//        if (!f.exists()) {
//            String file = fileName.substring(0, fileName.lastIndexOf("\\"));
//            File fs = new File(file);
//            if (!fs.exists()) {
//                fs.mkdirs();
//            }
//            f.createNewFile();
//        }
//        FileOutputStream o = null;
//        try {
//            o = new FileOutputStream(fileName);
//            o.write(text.getBytes("UTF-8"));
//            o.close();
//        } catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }
//    }
//
//    public static void createdFile(String path, String modelName, Class clazz) throws IOException {
//        createdFile(createServiceInterface(modelName, clazz), path + "service\\" + clazz.getSimpleName() + "Service.java");
//        createdFile(createServiceInterfaceImpl(modelName, clazz), path + "service\\impl\\" + clazz.getSimpleName() + "ServiceImpl.java");
//        createdFile(createServiceInterfaceImpl(modelName, clazz), path + "mapper\\" + clazz.getSimpleName() + "Mapper.java");
//    }
//
//    public static void createdFile(String path, String modelName, Class... clazzs) throws IOException {
//        for (Class clazz : clazzs) {
//            createdFile(path, modelName, clazz);
//        }
//    }
//
//}
